package clm.cuc_for_java_bk.atm.nicebank;

import org.openqa.selenium.WebDriver;

public interface Teller
{
	void withdrawFrom(Account account, int dollars);
	
	WebDriver getWebDriver();
}
