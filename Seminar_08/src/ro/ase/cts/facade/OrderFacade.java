package ro.ase.cts.facade;

public class OrderFacade {
private Waiter myWaiter;
private Kitchen mykitchen;

public OrderFacade()
{
	myWaiter=new Waiter("Cosmin");
	mykitchen=new Kitchen();
}
public void order()
{
	myWaiter.takeOrder();
	myWaiter.sendOrderToTheKitchen();
	mykitchen.prepareFood();
	mykitchen.callTheWaiter();
	myWaiter.serveCustomer();
	mykitchen.washTheDishes();
}
}
