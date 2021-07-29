package com.bridgelabz.factorypattern;

public class EmailNotification  implements Notification{

	@Override
	public void showNotification() {
	    //logic to notify a user through email	
		System.out.println("Notification has sent through Email");
	}

}
