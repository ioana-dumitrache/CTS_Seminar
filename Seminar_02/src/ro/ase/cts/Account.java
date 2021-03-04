package ro.ase.cts;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(double amount, Account destination);
	public abstract double getbalance();

}
