package com.exception_basic.java;

public class Ex2 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println("hurry up");
			System.out.println(10/0);
			System.out.println("quite");
			
		}catch(ArithmeticException e) {
			 System.out.println("Catch ="+e.toString());
			System.out.println("bye");
		}
	}

}
