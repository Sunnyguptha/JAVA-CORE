package com.exception_Advance.java;

public class UserDefinedExceptionEx1 {

	public static void main(String[] args) throws LoginException {
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			
		throw new LoginException("login is failed,please check the credentials");
			
			
		}
		
		
		
		

	}

}
