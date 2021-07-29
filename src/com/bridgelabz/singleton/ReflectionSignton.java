package com.bridgelabz.singleton;

public class ReflectionSignton {

private static final ReflectionSignton object = new ReflectionSignton();
	
	private ReflectionSignton() {}
	
	public static ReflectionSignton getObject() {
		return object;
	}
}
