package com.core.basicJava;



public class Ex9_ForNameAndNewInstance {
	public static void main() throws ClassNotFoundException
	{
		Class c=Class.forName("Ex9_Employee");
		System.out.println(c);
		
	}
}
