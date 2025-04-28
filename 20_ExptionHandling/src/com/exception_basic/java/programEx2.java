package com.exception_basic.java;

public class programEx2 {

	public static void main(String[] args) {
		methodTwo();

	}
	
	// stackTrace
	/*Exception name= java.lang.ArithmeticException
	 * Exception message= / by zero
	 * which line number
	 * method information=
	 * 
	 */
	
	public static void methodTwo()
	{
		methodOne();
	}
	
	public static void methodOne()
	{
		int fNumber=2;
		
		int sNumber=10;
		
		int tNumber=fNumber/sNumber;
		
		System.out.println("output="+tNumber);
	}

}
