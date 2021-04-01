package ro.ase.cts.seminar06.builder;

public class TechProduct implements Product{
	int id;
	String productName;
	String manufacturor;
	String displayType;
	String model;
	float price;
	private TechProduct()
	{
		
	}
	public TechProduct(String productName)
	{
		
	}
	@Override
	public String getDescription() {
		return "generic";
	}
}
