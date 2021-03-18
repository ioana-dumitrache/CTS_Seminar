package ro.ase.cts;

public abstract class BankAccount extends Account {

	protected double balance;
	public String iban;
	
	public BankAccount() {
		this.balance = 0;
		this.iban = "";
	}
	
	public BankAccount(double balance, String iban) {
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

	
}
