package ro.ase.cts.main;

import java.util.Scanner;

import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.ProductFactory;
import ro.ase.cts.seminar5.factory.TechProduct;
import ro.ase.cts.seminar5.singleton.Cart;

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
