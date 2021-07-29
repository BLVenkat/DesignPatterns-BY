package com.bridgelabz.factorypattern;

public class PushMessageNotification implements Notification {

	@Override
	public void showNotification() {
	    //logic to notify a user through push message	
		System.out.println("Notification has sent through push message");
	}

	
}
