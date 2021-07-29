package com.bridgelabz.singleton;

public class ThreadSafeSingletonRunner {

	public static void main(String[] args) {
		ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstance();
		System.out.println(threadSafe.hashCode());
		System.out.println(threadSafe1.hashCode());

	}
}
