package ro.ase.cts.observer;

import java.util.ArrayList;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable{

	public CreditAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditAccount(double balance, String iban, ArrayList<NotificationInterface> obs) {
		super(balance, iban, obs);
		// TODO Auto-generated constructor stub
	}

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
		for(NotificationInterface observer: this.observers)
			observer.notifyUser(amount);
	}



}
