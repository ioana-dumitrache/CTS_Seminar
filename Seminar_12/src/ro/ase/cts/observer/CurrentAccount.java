package ro.ase.cts.observer;

import java.util.ArrayList;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable, NotificationService, NotificationInterface {

	public static double MAX_CREDIT=1000;
	public NotificationService notificationService;
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban, ArrayList<NotificationInterface> observers) {
		super(balance, iban, observers);

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

	@Override
	public void notifyUser(double amount) {
		// TODO Auto-generated method stub
		
	}
}
