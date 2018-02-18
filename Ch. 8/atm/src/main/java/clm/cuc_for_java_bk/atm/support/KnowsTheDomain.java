package clm.cuc_for_java_bk.atm.support;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.CashSlot;
import clm.cuc_for_java_bk.atm.nicebank.Teller;

public class KnowsTheDomain
{
	public final static Logger LOG = LogManager.getLogger(KnowsTheDomain.class);
	
	private Account myAccount;
	private CashSlot cashSlot;
	private Teller teller;
	private EventFiringWebDriver webDriver;
	
	public Account getMyAccount()
	{
		if(myAccount == null)
		{
			myAccount = new Account();
		}
		
		return myAccount;
	}
	
	public CashSlot getCashSlot()
	{
		if(cashSlot == null)
		{
			cashSlot = new CashSlot();
		}
		
		return cashSlot;
	}
	
	public Teller getTeller()
	{
		if(teller == null)
		{
			teller = new AtmUserInterface();
		}
		
		return teller;
	}
	
	public EventFiringWebDriver getWebDriver()
	{
		if(webDriver == null)
		{
			LOG.debug("++ KnowsTheDomain : Created new WebDriver");
			System.setProperty("webdriver.gecko.driver", "webdrivers\\geckodriver.exe");
			webDriver = new EventFiringWebDriver(new FirefoxDriver());
		}
		
		return webDriver;
	}

}
