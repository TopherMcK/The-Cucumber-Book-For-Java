package clm.cuc_for_java_bk.atm.nicebank;

import org.junit.Assert;

import clm.cuc_for_java_bk.atm.support.KnowsTheDomain;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import clm.cuc_for_java_bk.atm.transforms.MoneyConverter;

public class AccountSteps
{
	public AccountSteps(KnowsTheDomain helper)
	{
		this.helper = helper;
	}
	
	KnowsTheDomain helper;
	
	@Before
	public void init() throws InterruptedException
	{
	}

	@Given("^my account has been credited \\$(\\d+\\.\\d+)$")
	public void myAccountHasBeenCredited$(@Transform(MoneyConverter.class) Money amount) throws Throwable
	{
		helper.getMyAccount().deposit(amount);
	}

	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(int dollars) throws Throwable
	{
		helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable
	{
		Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
	}

	@Then("^the balance of my account should be \\$(\\d+)\\.(\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable
	{
		Assert.assertEquals("Incorrect amount dispensed -", amount.getDollars(), helper.getMyAccount().getBalance().getDollars());
	}
}
