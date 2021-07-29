package com.bridgelabz.singleton;

public class EgarIntializationSingletonRunner {

	public static void main(String[] args) {
		
	//	EgarIntializationSingleton singleton = new EgarIntializationSingleton();
		EgarIntializationSingleton singletonObject =  EgarIntializationSingleton.getObject();
		EgarIntializationSingleton singletonObject1 =  EgarIntializationSingleton.getObject();
		EgarIntializationSingleton singletonObject2 =  EgarIntializationSingleton.getObject();
		System.out.println(singletonObject.hashCode());
		System.out.println(singletonObject1.hashCode());
		System.out.println(singletonObject2.hashCode());

	}
}
