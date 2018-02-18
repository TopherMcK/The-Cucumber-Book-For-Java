package clm.cuc_for_java_bk.atm.transforms;

import clm.cuc_for_java_bk.atm.nicebank.Money;
import cucumber.api.Transformer;

public class MoneyConverter extends Transformer<Money>
{
	public Money transform(String amount)
	{
		String[] numbers = amount.substring(1).split("\\.");
		
		int dollars = Integer.parseInt(numbers[0]);
		int cents = Integer.parseInt(numbers[1]);
		
		return new Money(dollars, cents);
	}
}
