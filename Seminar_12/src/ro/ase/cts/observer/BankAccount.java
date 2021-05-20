package ro.ase.cts.observer;

import java.util.ArrayList;

public abstract class BankAccount extends Account {

	protected ArrayList<NotificationInterface> observers;
	protected double balance;
	public String iban;
	
	public BankAccount() {
		this.observers=null;
		this.balance = 0;
		this.iban = "";
	}
	
	public BankAccount(double balance, String iban, ArrayList< NotificationInterface> obs) {
		this.observers=obs;
		this.balance = balance;
		this.iban = iban;
	}

	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
public void addObserver(NotificationInterface observer)
{
	this.observers.add(observer);
}
public void removeObserver(NotificationInterface observer)
{
	this.observers.remove(observer);
}
	
}
