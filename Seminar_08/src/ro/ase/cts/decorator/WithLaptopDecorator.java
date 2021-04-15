package ro.ase.cts.decorator;

public class WithLaptopDecorator extends AbstractBackPackDecorator{

	public WithLaptopDecorator(AbstractBackPack basicBackPack) {
		super(basicBackPack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		this.basicBackPack.pack();
		System.out.println("+ Laptop");
		
	}

}
