package com.bridgelabz.singleton;

public class LazyIntializationSingletonRunner {

	public static void main(String[] args) {
		LazyIntializationSingleton lazyObject = LazyIntializationSingleton.getObject();
		LazyIntializationSingleton lazyObject1 = LazyIntializationSingleton.getObject();
		System.out.println(lazyObject.hashCode());
		System.out.println(lazyObject1.hashCode());

	}
}
