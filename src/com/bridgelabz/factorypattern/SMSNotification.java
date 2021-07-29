package com.bridgelabz.factorypattern;

public class SMSNotification implements Notification{

	@Override
	public void showNotification() {
	    //logic to notify a user through SMS	
		System.out.println("Notification has sent through SMS");
	}
}
