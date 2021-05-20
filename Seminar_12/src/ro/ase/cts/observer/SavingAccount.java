package ro.ase.cts.observer;

import java.util.ArrayList;

public class SavingAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable, NotificationInterface{

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double balance, String iban, ArrayList<NotificationInterface>observers) {
		super(balance, iban, observers);
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

	@Override
	public void notifyUser(double amount) {
		// TODO Auto-generated method stub
		
	}

}
