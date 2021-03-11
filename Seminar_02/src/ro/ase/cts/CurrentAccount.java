package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public static double MAX_CREDIT=1000;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.setBalance(getbalance()+amount);
		this.balance+=amount;  
	}

	@Override
	public void withdraw(double amount)throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(this.balance>=amount)
		{
			this.balance-=amount;
		
		}
		else
		{	
			throw new InsufficientFundsException("fonduri insuficiente!");
		}
		
	}

	@Override
	public void transfer(double amount, Account destination)throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if(((BankAccount)destination).iban.equals(this.iban))
		{
			throw new IllegalTransferException("transfer ilegal!");
		}
		else
		{
			this.withdraw(amount);
			destination.deposit(amount);
		}

	}
}
