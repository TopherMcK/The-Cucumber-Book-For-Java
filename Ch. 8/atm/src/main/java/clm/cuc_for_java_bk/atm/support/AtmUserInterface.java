package clm.cuc_for_java_bk.atm.support;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import clm.cuc_for_java_bk.atm.hooks.ServerHooks;
import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.AccountSteps;
import clm.cuc_for_java_bk.atm.nicebank.Teller;
import clm.cuc_for_java_bk.atm.server.AtmServer;

public class AtmUserInterface implements Teller
{
	public final static Logger LOG = LogManager.getLogger(AtmUserInterface.class);
	
	public AtmUserInterface()
	{
		// Firefox setup
		System.setProperty("webdriver.gecko.driver", "webdrivers\\geckodriver.exe");
		this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
	}
	
	private WebDriver webDriver;

	public void withdrawFrom(Account account, int dollars)
	{
			String uri = "http://192.168.56.1:9988";
			LOG.debug("^^ withdrawFrom() : uri = \n" + uri);
			webDriver.get(uri);
			webDriver.findElement(By.id("Amount"))
			.sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("Withdraw"))
			.click();
	}
	
	public WebDriver getWebDriver()
	{
		return webDriver;
	}

}
