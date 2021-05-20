package ro.ase.cts.observer;

public class EmailNotificationService implements NotificationService {

@Override
public void sendNotificationService(String message)
{
	System.out.println(""+message);
}
}
