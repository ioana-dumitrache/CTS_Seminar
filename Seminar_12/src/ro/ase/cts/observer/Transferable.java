package ro.ase.cts.observer;

public interface Transferable {
	public abstract void transfer(double amount, Depositable destination)throws IllegalTransferException, InsufficientFundsException;
}
