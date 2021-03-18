package ro.ase.cts;

import ro.ase.cts.exceptions.InsufficientFundsException;
import ro.ase.cts.interfaces.Depositable;
import ro.ase.cts.interfaces.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable{

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
			this.balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount>0)
			this.balance-=amount;
		
	}



}
