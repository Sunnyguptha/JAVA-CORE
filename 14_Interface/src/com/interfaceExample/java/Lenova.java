package com.interfaceExample.java;

public class Lenova implements Laptop{

	public void copy() {
		System.out.println(" lenova code code");
		
	}

	@Override
	public void past() {
		System.out.println("lenova past code");
		
	}

	@Override
	public void cut() {
		System.out.println("lenova cut code");
		
	}
	@Override
	public void security() {
		System.out.println("lenova security code");
	}

}
