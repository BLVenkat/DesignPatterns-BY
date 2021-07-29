package com.bridgelabz.singleton;

import java.lang.reflect.Constructor;

public class EnumSingletonRunner {
		public static void main(String[] args) {
			EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
			EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
			System.out.println(enumSingleton.hashCode());
			System.out.println(enumSingleton1.hashCode());

			enumSingleton.setNumber(1);
			System.out.println(enumSingleton1.getNumber());
			
//			try {
//	            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
//	            for (Constructor constructor : constructors) {
//	                constructor.setAccessible(true);
//	                enumSingleton1 = (EnumSingleton) constructor.newInstance();
//	                break;
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
			
			
			
					}
}
