package ro.ase.cts.decorator;

public class WithFood extends AbstractBackPackDecorator{
	
	String food;
	
	public WithFood(AbstractBackPack basicBackPack) {
		super(basicBackPack);
		// TODO Auto-generated constructor stub
	}
	public WithFood(AbstractBackPack basicBackPack, String food) {
		super(basicBackPack);
		this.food=food;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		this.basicBackPack.pack();
		System.out.println(getFood()+ "+ Food");
	}
	public String getFood() {
		return food;
	}

}
