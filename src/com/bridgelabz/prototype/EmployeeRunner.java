package com.bridgelabz.prototype;

public class EmployeeRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address orignalAddress = new Address(1, "3-64", "andhra");
		Address cloneAddress = (Address) orignalAddress.clone();
		
		Employee originalEmployee = new Employee(1, "Venkat Reddy", orignalAddress);	
		Employee clonedEmployee = (Employee)originalEmployee.clone();
			clonedEmployee.setAddress(cloneAddress);
			
		System.out.println("Orignal : "+ originalEmployee);
		System.out.println("cloned : "+ clonedEmployee);
		
		System.out.println(originalEmployee.hashCode());
		System.out.println(clonedEmployee.hashCode());
		
		originalEmployee.getAddress().setState("Telangana");
		System.out.println("After Modification");
		System.out.println("Orignal : "+ originalEmployee);
		System.out.println("cloned : "+ clonedEmployee);
		
		System.out.println(originalEmployee.getAddress().hashCode());
		System.out.println(clonedEmployee.getAddress().hashCode());
	}
}
