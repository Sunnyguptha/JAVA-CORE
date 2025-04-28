package com.exception_basic.java;

public class ProgramEx1 {

	public static void main(String[] args) {
	System.out.println("program start");
		/*
		int fNumber=2; 
		int sNumber=1;			OUTPUT=2
		
		int tNumber=fNumber/sNumber;
	*/	
	
	int fNumber=2; 
	int sNumber=0;
	int tNumber=0;
	
	try {
		
			tNumber=fNumber/sNumber;
System.out.println("Result: " + tNumber); // This line will never execute
	}
	catch(ArithmeticException e) {
		System.out.println(e.toString());
		System.out.println("Cannot divide by zero!");
		//throw e;
	}
	finally {
		System.out.println("finally block");
	}
		System.out.println("output="+tNumber);
		System.out.println("progmam end");
	}

}
