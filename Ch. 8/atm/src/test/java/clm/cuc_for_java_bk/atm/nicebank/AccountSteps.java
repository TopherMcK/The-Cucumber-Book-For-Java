package clm.cuc_for_java_bk.atm.nicebank;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import clm.cuc_for_java_bk.atm.server.AtmServer;
import clm.cuc_for_java_bk.atm.support.KnowsTheDomain;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import clm.cuc_for_java_bk.atm.transforms.MoneyConverter;
import clm.cuc_for_java_bk.atm.utils.Screen;

public class AccountSteps
{
	private static Logger log = LogManager.getLogger();

	public AccountSteps(KnowsTheDomain helper)
	{
		this.helper = helper;
	}

	KnowsTheDomain helper;
	public static final int PORT = 9988;

	private AtmServer server;

	@Before
	public void startServer()  throws MalformedURLException, Exception
	{
		server = new AtmServer(PORT, helper.getCashSlot(), helper.getMyAccount());
		server.start();
		log.debug("++ AtmServer Started!");
	}

	@Given("^my account has been credited (\\$\\d+\\.\\d+)$")
	public void myAccountHasBeenCredited$(@Transform(MoneyConverter.class) Money amount) throws Throwable
	{
		log.debug("~~ Called @Given myAccountHasBeenCredited$ amount = $" + amount.getDollars() + "." + amount.getCents());
		helper.getMyAccount().deposit(amount);
		log.debug("^^ @Given myAccountHasBeenCredited$ : $" + helper.getMyAccount().getBalance().getDollars() + "." + helper.getMyAccount().getBalance().getCents());
	}

	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(int dollars) throws Throwable
	{
		log.debug("^^ @When iWithdraw$");
		helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
		log.debug("^^ @When iWithdraw$ : $" + helper.getMyAccount().getBalance().getDollars() + "." + helper.getMyAccount().getBalance().getCents());
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable
	{
		log.debug("^^ @Then $ShouldBeDispensed");
		Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
	}

	@Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable
	{
		log.debug("^^ @Then theBalanceOfMyAccountShouldBe$");
		Assert.assertEquals("Incorrect amount balance -", amount.getDollars(),
				helper.getMyAccount().getBalance().getDollars());
	}

	@After
	public void finish(Scenario scenario)
	{
		log.debug("************** @After finish()");

		if (scenario.isFailed())
		{
			log.error("-- Scenario Failed!");
			try
			{
				log.debug("$$ Trying Screenshot...");
				byte[] screenshot = ((TakesScreenshot) helper.getWebDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "img/png");
				log.debug("++ Screenshot Successful");
				Screen screen = new Screen();
				screen.screenshot(helper.getWebDriver(), scenario);
			} catch (WebDriverException somePlatformsDontSupportScreenShots)
			{
				log.error("-- Screenshot Failed! : " + somePlatformsDontSupportScreenShots.getMessage());
			} finally
			{
				helper.getWebDriver().close();
			}
		}
		else
		{
			helper.getWebDriver().close();
			log.debug("************** Scenarion: " + scenario.getName() + " : finished!");
		}
	}
	
	@After
	public void stopServer() throws Exception
	{
		server.stop();
	}
}
