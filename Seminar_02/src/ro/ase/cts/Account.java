package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount)throws InsufficientFundsException;
	public abstract void transfer(double amount, Account destination)throws IllegalTransferException, InsufficientFundsException;
	public abstract double getbalance();

}
