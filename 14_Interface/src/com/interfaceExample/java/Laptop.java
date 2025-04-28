package com.interfaceExample.java;

public interface Laptop {
	
	void copy();
	
	void past();
	
	void cut();
	
	default void security() {
		audio();
	//	commonCode();
		System.out.println(" laptop security code ");
	}//default should create object for accessing purpose
	
	static void audio() {
	//	commonCode();
		System.out.println(" please implement");
	}
	// private static void commonCode() {
	    //    System.out.println("Common security code");
	 //   } after java 9
}
