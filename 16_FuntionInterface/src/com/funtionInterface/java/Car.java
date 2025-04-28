package com.funtionInterface.java;

@FunctionalInterface
public  interface Car {
	void Drive();
	
	default void brake() {
		
		System.out.println(" brake code");
	}
	
	static void ligth()
	{
		System.out.println("door code");
	}
	
	default int model() {
		return 71;
	}
	
	static void electrical()
	{
		System.out.println("electrical code");
	}
	

	
}
