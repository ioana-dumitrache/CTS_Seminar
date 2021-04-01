package ro.ase.cts.seminar06.main;

import java.util.Scanner;
import ro.ase.cts.seminar06.builder.AbstractProductFactory;
import ro.ase.cts.seminar06.builder.OfficeProduct;
import ro.ase.cts.seminar06.builder.Product;
import ro.ase.cts.seminar06.builder.ProductFactory;
import ro.ase.cts.seminar06.builder.TechProduct;
import ro.ase.cts.seminar06.builder.TechProductFactory;
import ro.ase.cts.seminar06.singleton.Cart;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart myShoppingCart=Cart.getInstance("shopping");
		//Product smartphone=new TechProduct();
		//Product paperClip=new OfficeProduct();
		//myShoppingCart.products.add(smartphone);
		//myShoppingCart.products.add(paperClip);
		Scanner scan=new Scanner(System.in);
		System.out.println("catalog produse:\n tech-Produse tech \n office-Produse office");
		String userPref=scan.nextLine();
		Product myProduct=null;
		ProductFactory productFactory=new ProductFactory();
		myProduct=productFactory.makeProduct(userPref, "generic");
		AbstractProductFactory productFactory2=null;
		if(userPref!=null)
		{
			if(userPref.equalsIgnoreCase("tech"))
			{
				productFactory2=new TechProductFactory() {
				};
			}
		}
		System.out.println(productFactory2.getCatalog());
		userPref=scan.nextLine();
		try{
			int selectedID=Integer.valueOf(userPref);
			myProduct=productFactory2.makeProduct(selectedID);
		}catch(NumberFormatException e)
		{
			System.err.println("Selectie invalida");
		}
		
		//if(userPref.equalsIgnoreCase("tech"))
		//{
		//	myProduct=new TechProduct();
		//}
		//else if(userPref.equalsIgnoreCase("office"))
		//{
		//	myProduct=new OfficeProduct();
		//}
		//else
		//{
		//	System.out.println("Opt invalida");
		//	System.out.println("catalog produse:\n tech-Produse tech \n-Produse office");
		//}
		if(myProduct!=null)
		{
			myShoppingCart.products.add(myProduct);
		}
		
		
		for(Product p:myShoppingCart.products)
			System.out.println(p.getDescription());
	}

}
