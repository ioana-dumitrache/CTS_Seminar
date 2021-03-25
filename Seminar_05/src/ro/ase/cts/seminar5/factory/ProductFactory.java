package ro.ase.cts.seminar5.factory;
import ro.ase.cts.seminar5.factory.Product;
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
