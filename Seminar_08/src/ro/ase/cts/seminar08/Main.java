package ro.ase.cts.seminar08;

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
	}

}
