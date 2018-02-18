package clm.cuc_for_java_bk.atm.support;

import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.CashSlot;
import clm.cuc_for_java_bk.atm.nicebank.Teller;

public class KnowsTheDomain
{
	private Account myAccount;
	private CashSlot cashSlot;
	private Teller teller;
	
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

}
