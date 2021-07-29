package com.bridgelabz.factorypattern;

public class NotificationClient {

	public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		Notification smsObject = factory.getNotification("sms");
		smsObject.showNotification();
	}
}
