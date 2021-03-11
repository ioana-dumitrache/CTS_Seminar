package ro.ase.cts;

public class Bank {
public static int nextID;
public BankAccount openBankAccount(AccountType tipCont)
{
	if(tipCont==AccountType.CURRENT)
		{
		return new CurrentAccount();
		}
	else if(tipCont==AccountType.SAVINGS)
		{
		return new SavingAccount();
		}
	
	else
	{
		throw new UnsupportedOperationException();
	}
}
}
