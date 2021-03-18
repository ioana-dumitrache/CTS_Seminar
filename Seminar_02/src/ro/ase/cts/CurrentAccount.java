package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;
import ro.ase.cts.interfaces.Depositable;
import ro.ase.cts.interfaces.NotificationService;
import ro.ase.cts.interfaces.Transferable;
import ro.ase.cts.interfaces.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable, NotificationService {

	public static double MAX_CREDIT=1000;
	public NotificationService notificationService;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);

		// TODO Auto-generated constructor stub
	}
	

	

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
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
		if(this.notificationService!=null)
		this.notificationService.sendNotificationService("S-a extras o anumita suma"+amount);
	}

	@Override
	public void transfer(double amount, Depositable destination)throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if(((BankAccount)destination).iban.equals(this.iban))
		{
			throw new IllegalTransferException("transfer ilegal!");
		}
		else
		{
			this.withdraw(amount);
			((Depositable) destination).deposit(amount);
		}

	}

	@Override
	public void sendNotificationService(String message) {
		// TODO Auto-generated method stub
		
	}
}
