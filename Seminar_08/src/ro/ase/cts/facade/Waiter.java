package ro.ase.cts.facade;

public class Waiter {
String nume;

public Waiter(String nume) {
	super();
	this.nume = nume;
}
public void takeOrder() {
	
	System.out.println("Order taken!");
}
public void sendOrderToTheKitchen() {
	System.out.println("Order send!");
}
public void serveCustomer() {
	System.out.println("Order served!");
}
}
