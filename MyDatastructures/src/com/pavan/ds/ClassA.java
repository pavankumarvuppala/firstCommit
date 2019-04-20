package com.pavan.ds;

public class ClassA implements MyInterface{
	
	public String name ;
	public String value;
	public void show () {
		
		System.out.println("In class A");
		
		System.out.println("name: " + name + " value: " + value);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void sayHello () {
		
		System.out.println("In class A saying hello");
		
		
	}
}
