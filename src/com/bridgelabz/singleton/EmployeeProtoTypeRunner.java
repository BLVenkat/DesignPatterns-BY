package com.bridgelabz.singleton;

public class EmployeeProtoTypeRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		EmployeeProtoType orignalObject  = new EmployeeProtoType();
		orignalObject.loadData();
		
		EmployeeProtoType clonedObject = (EmployeeProtoType)orignalObject.clone();
		
		orignalObject.getEmpList().add("Venkat");
		clonedObject.getEmpList().remove("Raj");
		
		System.out.println("Original:"+ orignalObject);
		System.out.println("Cloned:"+ clonedObject);
		
		System.out.println(orignalObject.hashCode());
		System.out.println(clonedObject.hashCode());

	}
	 
}
