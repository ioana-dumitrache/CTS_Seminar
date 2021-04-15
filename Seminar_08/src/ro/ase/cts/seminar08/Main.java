package ro.ase.cts.seminar08;

import ro.ase.cts.composite.CatalogComponent;
import ro.ase.cts.composite.Product;
import ro.ase.cts.composite.ProductCatalog;
import ro.ase.cts.decorator.AbstractBackPack;
import ro.ase.cts.decorator.BackPack;
import ro.ase.cts.decorator.WithFood;
import ro.ase.cts.decorator.WithLaptopDecorator;
import ro.ase.cts.facade.Kitchen;
import ro.ase.cts.facade.OrderFacade;
import ro.ase.cts.facade.Waiter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Waiter w1= new Waiter("Adrian");
		//Kitchen k1=new Kitchen();
		//w1.takeOrder();
		//w1.sendOrderToTheKitchen();
		//k1.prepareFood();
		//k1.callTheWaiter();
		//w1.serveCustomer();
		//k1.washTheDishes();
		
		OrderFacade orderFacade=new OrderFacade();
		orderFacade.order();
		System.out.println("--------------------------------------------------------------");
		
		CatalogComponent laptop=new Product("Laptop Asus", 3500);
		CatalogComponent smartphone = new Product("Samsung Galaxy S20",4000);
		CatalogComponent techProd=new ProductCatalog("Tech products");
		techProd.add(laptop);
		techProd.add(smartphone);
		
		CatalogComponent officeProd=new ProductCatalog("Office products");
		CatalogComponent paperclip=new Product("Bic", 10);
		CatalogComponent pen=new Product("Schneider", 25);
		officeProd.add(paperclip);
		officeProd.add(pen);
		
		CatalogComponent genericProd=new ProductCatalog("Generic products");
		genericProd.add(new Product("Generic product", 0));
		genericProd.add(techProd);
		genericProd.add(officeProd);
		
		System.out.println(genericProd);
		System.out.println("--------------------------------------------------------------");
		
		AbstractBackPack myBackPack=new BackPack();
		myBackPack.pack();
		AbstractBackPack myBackPack2=new WithLaptopDecorator(new WithFood(myBackPack, "banane"));
		myBackPack2.pack();
	}

}
