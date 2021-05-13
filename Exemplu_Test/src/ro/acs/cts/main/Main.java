package ro.acs.cts.main;

import ro.ase.cts.adapter.AdapterCont;
import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.singleton.SingletonBanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonBanca banca = SingletonBanca.getInstance("BCR", "Romana");
		System.out.println(SingletonBanca.NRCONTURI);
		
		ContBancar contBancar1 = banca.createInstance("CREDIT");
		System.out.println(SingletonBanca.NRCONTURI);
		
		ContBancar contBancar2 = banca.createInstance("DEBIT");
		System.out.println(SingletonBanca.NRCONTURI);
		
		ContBancar adapterCont = new AdapterCont();
		
		adapterCont.transfer(contBancar1, 20);
		adapterCont.depunde(30);
	}

}
