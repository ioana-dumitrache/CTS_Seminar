package ro.ase.cts.adapter;

import ro.ase.cts.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar{
	private double total=500;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		// TODO Auto-generated method stub
		total+=suma;
		destinatie.depunde(suma);
		System.out.println( suma + "de lei a fost adaugata in "+destinatie + "->cont Debit");
	}

	@Override
	public void depunde(double suma) {
		// TODO Auto-generated method stub
		total+=suma;
		System.out.println(suma +"de lei a fost adaugata in contul curent -> Debit");
	}

	@Override
	public void accountTrasfer(BankAccount account, double amount) {
		// TODO Auto-generated method stub
		this.transfer(this, amount);
		
	}

}
