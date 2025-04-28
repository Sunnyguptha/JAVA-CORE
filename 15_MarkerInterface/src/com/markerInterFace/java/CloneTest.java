package com.markerInterFace.java;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee em=new Employee();
		Object o=em.clone();
		Employee emp=(Employee)o;
		System.out.println(emp);
		
	

	}

}
