package ro.ase.cts;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount ca=new CurrentAccount(800, "IBAN");
		CurrentAccount ca2=new CurrentAccount(600, "IBAN2");
		System.out.println("suma disponibila este:"+ ca.getbalance());
		System.out.println("creditul maxim este "+CurrentAccount.MAX_CREDIT);
		ca.deposit(200);
		System.out.println("suma disponibila este:"+ ca.getbalance());
		try {
			ca.withdraw(600);
			ca.transfer(200,ca2);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} 
		System.out.println("suma disponibila este:"+ ca.getbalance());
		System.out.println("suma disponibila din contul 2 este: "+ca2.getbalance());
	}
	

}
