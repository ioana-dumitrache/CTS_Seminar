package ro.ase.cts.singleton;

import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.factory.ContCredit;
import ro.ase.cts.factory.ContDebit;

public class SingletonBanca {

	public static final char[] NRCONTURI = null;
	private String denumiree;
	private String adresa;
	private static int NRCONT;
	
	private static SingletonBanca INSTANCE;

	public SingletonBanca(String denumiree, String adresa) {
		super();
		this.denumiree = denumiree;
		this.adresa = adresa;
	}
	
	public static SingletonBanca getInstance(String denumire, String adresa)
	{
		if(INSTANCE==null)
			INSTANCE=new SingletonBanca(denumire, adresa);
		return INSTANCE;
		
	}
	public ContBancar createInstance(String tipCont)
	{
	ContBancar contBancar;
		
		int NRCONTURI = 0;
		switch(tipCont) {
		case "CREDIT":
			contBancar = new ContCredit();
			NRCONTURI++;
			break;
		case "DEBIT":
			contBancar = new ContDebit();
			NRCONTURI++;
		default:
			contBancar = null;
			
		}
		return contBancar;
	}
	}

