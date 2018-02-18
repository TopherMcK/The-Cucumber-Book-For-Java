package clm.cuc_for_java_bk.atm.nicebank;

public class Money
{
	public Money(int dollars, int cents)
	{
		this.dollars = dollars;
		this.cents = cents;
	}
	
	public Money()
	{}
	
	private Money balance;
	private int dollars;
	private int cents;
	
	public Money add(Money amount)
	{
		this.balance = amount;
		return balance;
	}
	
	public Money minus(Money withdraw)
	{
		withdraw.dollars = dollars - withdraw.dollars;
		return withdraw;
	}

	public Money getBalance()
	{
		return balance;
	}

	public void setBalance(Money balance)
	{
		this.balance = balance;
	}

	public int getDollars()
	{
		return dollars;
	}

	public void setDollars(int dollars)
	{
		this.dollars = dollars;
	}

	public int getCents()
	{
		return cents;
	}

	public void setCents(int cents)
	{
		this.cents = cents;
	}

}
