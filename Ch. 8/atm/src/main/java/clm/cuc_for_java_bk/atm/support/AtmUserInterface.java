package clm.cuc_for_java_bk.atm.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.Teller;

public class AtmUserInterface implements Teller
{
	public AtmUserInterface()
	{
		//Firefox setup
		System.setProperty("webdriver.gecko.driver", "webdrivers\\geckodriver.exe");
		this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
	}
	
	private WebDriver webDriver;

	public void withdrawFrom(Account account, int dollars)
	{
		try
		{
			webDriver.manage().window().maximize();
			webDriver.get("http://192.168.56.1:9988/");
			webDriver.findElement(By.id("Amount"))
			.sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("Withdraw"))
			.click();
			
		}
		finally
		{
			webDriver.close();
		}
		
	}

}
