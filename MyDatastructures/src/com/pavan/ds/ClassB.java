package com.pavan.ds;

public class ClassB extends ClassA implements MyInterface {
	public String name;
	
	public void show () {
		
		System.out.println("In class B");
		
		
	}
	public void displayB() {
		System.out.println("from b name: "+ name);
	}
}



