package ro.ase.cts.seminar06.builder;
public class ProductFactory {
public Product makeProduct(String type, String productName)
{
		if(type.equalsIgnoreCase("tech"))
		{
			return new TechProduct(productName);
		}
		else if(type.equalsIgnoreCase("office"))
		{
			return new OfficeProduct(productName);
		}
		else
		{
			throw new UnsupportedOperationException();
		}
			
}




}
