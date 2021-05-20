package cts.dumitrache.ioana.g1080.pattern.state;


public class Cerere {
	private ICerereStudent state;
	public Cerere()
	{
	state=new Avizata();
	}
	public void setState(ICerereStudent state) {
		this.state = state;
	}
	public void confirmare()
	{
		System.out.println("Cerere confirmata");
		state.confirmare();
	}
	public void verificare()
	{
		System.out.println("Cerere verificata");
		state.verificare();
	}
	public void avizareDecanat()
	{
		System.out.println("Cerere avizata");
		state.avizareDecanat();
	}

	public void respingere()
	{
		System.out.println("Cerere rspinsa");
		state.respingere();
	}
}
