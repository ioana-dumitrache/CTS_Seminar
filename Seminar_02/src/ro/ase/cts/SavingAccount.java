package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;
import ro.ase.cts.interfaces.Depositable;
import ro.ase.cts.interfaces.Profitable;
import ro.ase.cts.interfaces.Transferable;
import ro.ase.cts.interfaces.Withdrawable;

public class SavingAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable{

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
		//throw new UnsupportedOperationException();
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(amount<=this.balance)
		this.balance-=amount;
	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInterest(double interest) {
		// TODO Auto-generated method stub
		this.balance*=(1+interest/100);
	}

}
