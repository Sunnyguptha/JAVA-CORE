package com.exception_basic.java;

public class Ex7WithMultipleCatchBlock {

	public static void main(String[] args) {
		String s="SADSAD";
		System.out.println("hello");
		int a=10;
		int b=2;
		
		try {
		int c=a/b;
		System.out.println(c);
		System.out.println("length="+s.length());
		}catch(ArithmeticException e1) {
			e1.getMessage();
			System.out.println("number cannot divided by zero");
		}
		catch(NullPointerException e2) {
			e2.getMessage();
			System.out.println("cannot find length of null");
	}
		catch(Exception e3) {
			// This will catch any other exception not handled above
			//Catches any other exception not handled by the previous blocks.
			//No exceptions occur, so this block is also skipped.
		
		    System.out.println("General Exception caught: " + e3);
		}
		
		System.out.println("program continuee");
	}

}
