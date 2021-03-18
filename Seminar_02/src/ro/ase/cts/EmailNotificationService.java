package ro.ase.cts;

import ro.ase.cts.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

@Override
public void sendNotificationService(String message)
{
	System.out.println(""+message);
}
}
