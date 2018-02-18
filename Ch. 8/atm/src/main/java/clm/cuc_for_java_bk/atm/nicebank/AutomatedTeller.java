package clm.cuc_for_java_bk.atm.nicebank;

public class AutomatedTeller implements Teller
{
	public AutomatedTeller(CashSlot cashSlot)
	{
		this.cashSlot = cashSlot;
	}
	
	private CashSlot cashSlot;
	
	public void withdrawFrom(Account account, int dollars)
	{
		account.credit(dollars);
		cashSlot.dispense(dollars);
	}

}
