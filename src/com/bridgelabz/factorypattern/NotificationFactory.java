package com.bridgelabz.factorypattern;

public class NotificationFactory {

	public Notification getNotification(String NotificationType) {
		
		if(NotificationType.equalsIgnoreCase("Email"))
			return new EmailNotification();
		else if(NotificationType.equalsIgnoreCase("sms"))
			return new SMSNotification();
		else if(NotificationType.equalsIgnoreCase("Push"))
			return new PushMessageNotification();
		return null;
	}
}
