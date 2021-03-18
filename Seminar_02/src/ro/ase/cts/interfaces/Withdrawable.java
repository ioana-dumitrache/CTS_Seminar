package ro.ase.cts.interfaces;

import ro.ase.cts.exceptions.InsufficientFundsException;

public interface Withdrawable {
	public abstract void withdraw(double amount)throws InsufficientFundsException;
}
