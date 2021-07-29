package com.bridgelabz.singleton;

public class LazyIntializationSingleton {

	private static LazyIntializationSingleton object;
	
	private LazyIntializationSingleton() {}
	
	public static LazyIntializationSingleton getObject() {
		
		if(object == null) {
			object =  new LazyIntializationSingleton();
			return object;
		}
		return object;
	}
	
}
