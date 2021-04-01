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
	public TechProduct(int id)
	{
		super();
		this.id=id;
		
	}
	@Override
	public String getDescription() {
		return "generic";
	}
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getManufacturor() {
		return manufacturor;
	}
	public String getDisplayType() {
		return displayType;
	}
	public String getModel() {
		return model;
	}
	public float getPrice() {
		return price;
	}
	public static class TechProductBuilder
	{
		private TechProduct product;
		public TechProductBuilder(int id)
		{
			product=new TechProduct(id);
		}
		public TechProductBuilder setName(String name)
		{
			product.productName=name;
			return this;
		}
		public TechProductBuilder setManufactorer(String manufactorer)
		{
			product.manufacturor=manufactorer;
			return this;
		}
		public TechProductBuilder setModel(String model)
		{
			product.model=model;
			return this;
		}
		public TechProductBuilder setDisplayType(String displayType)
		{
			product.displayType=displayType;
			return this;
		}
		public TechProductBuilder setPrice(float price)
		{
			product.price=price;
			return this;
		}
		public TechProduct getProduct()
		{
			return product;
			
		}
	}
}
