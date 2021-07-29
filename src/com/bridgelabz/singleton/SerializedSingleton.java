package com.bridgelabz.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 7670978162962820238L;
	
	private static SerializedSingleton object;
	private SerializedSingleton() {}
	
	public static SerializedSingleton getObject() {
		
		if(object == null) {
			object = new SerializedSingleton();
			return object;
		}
		return object;
	}
	
	private Object readResolve() {
    	SerializedSingleton instance = getObject();
        return instance;
    }



}
