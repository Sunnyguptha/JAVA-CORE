package com.exception_basic.java;

public class Ex5 {

	public static void main(String[] args) {
		String s=null;
		System.out.println("hi");
		
		try {
		System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("exception message="+e.getMessage());
			e.printStackTrace();
			System.out.println("The variable s is assigned null, meaning it does not reference any object.");
		}

	}

}
