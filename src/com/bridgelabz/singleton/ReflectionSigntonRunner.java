package com.bridgelabz.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSigntonRunner {

	public static void main(String[] args) {
		ReflectionSignton reflection = ReflectionSignton.getObject();
		ReflectionSignton reflection1 =null;
		try {
            Constructor[] constructors = ReflectionSignton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                reflection1 = (ReflectionSignton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println(reflection.hashCode());
		System.out.println(reflection1.hashCode());

	}
}
