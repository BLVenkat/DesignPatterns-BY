package com.bridgelabz.singleton;

public enum EnumSingleton {

	INSTANCE;	
	
	int num;
	
	public int getNumber() {
		return num;
	}
	
	public void setNumber(int num) {
		this.num=num;
	}
}
