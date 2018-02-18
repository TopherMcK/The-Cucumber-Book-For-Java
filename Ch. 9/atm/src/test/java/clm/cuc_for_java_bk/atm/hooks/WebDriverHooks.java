package clm.cuc_for_java_bk.atm.hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import clm.cuc_for_java_bk.atm.support.KnowsTheDomain;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class WebDriverHooks
{
	public final static Logger LOG = LogManager.getLogger(WebDriverHooks.class);
	
	private KnowsTheDomain helper;
	
	@After
	public void finish(Scenario scenario)
	{
		try
		{
			byte[] screenshot = ((TakesScreenshot) helper.getWebDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "img/png");
		}
		catch(WebDriverException somePlatformsDontSupportScreenShots)
		{
			LOG.error(somePlatformsDontSupportScreenShots.getMessage());
		}
		finally
		{
			helper.getWebDriver().close();
		}
	}

}
