package com.bridgelabz.singleton;

public class EgarIntializationSingleton {

	private static final EgarIntializationSingleton object = new EgarIntializationSingleton();
	
	private EgarIntializationSingleton() {}
	
	public static EgarIntializationSingleton getObject() {
		return object;
	}
}
