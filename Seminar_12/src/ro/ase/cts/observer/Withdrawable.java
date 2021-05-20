package ro.ase.cts.observer;

public interface Withdrawable {
	public abstract void withdraw(double amount)throws InsufficientFundsException;
}
