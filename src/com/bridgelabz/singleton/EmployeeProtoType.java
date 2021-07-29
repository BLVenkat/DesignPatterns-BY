package com.bridgelabz.singleton;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProtoType implements Cloneable {

	private List<String> empList;
	
	public EmployeeProtoType(){
		
	empList = new ArrayList<String>();
	}
	
	public EmployeeProtoType(List<String> list){
			this.empList=list;
		}
	
		public void loadData(){
			empList.add("Pankaj");
			empList.add("Raj");
			empList.add("David");
			empList.add("Lisa");
		}
		
		
		public List<String> getEmpList() {
			return empList;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException{
			
				List<String> temp = new ArrayList<String>();
				for(String s : this.getEmpList()){
					temp.add(s);
				}
				return new EmployeeProtoType(temp);
		}

		@Override
		public String toString() {
			return "EmployeeProtoType [empList=" + empList + "]";
		}
		
		

	
}
