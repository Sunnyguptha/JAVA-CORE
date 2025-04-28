package com.interfaceExample.java;

public class HP implements Laptop{

	@Override
	public void copy() {
		System.out.println(" hp code code");
		
	}

	@Override
	public void past() {
		System.out.println("hp past code");
		
	}

	@Override
	public void cut() {
		System.out.println("hp cut code");
		
	}
	
	public void printer()
	{
		System.out.println(" hp printer code");
	}

}
