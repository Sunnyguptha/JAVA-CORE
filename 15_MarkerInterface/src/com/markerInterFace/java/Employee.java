package com.markerInterFace.java;

public class Employee implements Cloneable{
	int id=34;
	String name="sunny";
	
	public Employee() {
		methodOne();
		System.out.println(" from Constructor");
	}
	
	public void methodOne() {
		System.out.println("from methodOne");
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Object o=super.clone();
		return o;
	}

	public String toString()
	{
		return "Employee{"+" id="+id+", name="+name;
	}
}
