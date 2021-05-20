package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditAccount account = new CreditAccount();
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double ammount) {
				System.out.println("[inline example]: "+ammount+" extracted");
				
			}
		});
		
		NotificationInterface smsNotificationService = new SMSNotification();
		NotificationInterface emailNotificationService = new EmailNotification();
		
		account.addObserver(smsNotificationService);
		
		try {
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
