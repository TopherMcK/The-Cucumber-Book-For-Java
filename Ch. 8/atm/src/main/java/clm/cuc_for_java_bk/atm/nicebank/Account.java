package clm.cuc_for_java_bk.atm.nicebank;

public class Account
{
	private Money balance = new Money();
	
	public void credit(int dollars)
	{
		balance = balance.minus(new Money(dollars, 0));
	}
	
	public void deposit(Money amount)
	{
		balance = balance.add(amount);
	}
	
	public Money getBalance()
	{
		return balance;
	}

}
