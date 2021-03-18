package ro.ase.cts.interfaces;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public interface Transferable {
	public abstract void transfer(double amount, Depositable destination)throws IllegalTransferException, InsufficientFundsException;
}
