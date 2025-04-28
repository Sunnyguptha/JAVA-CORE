package com.core.basicJava;

public class Ex1 {
	int id=34;
	static String name="guptha";
	
	public void methodOne()
	{
		System.out.println("From methodOne");
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void methodTwo()
	{
		System.out.println("from static method");
		System.out.println(name);
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		e.methodOne();
		e.methodTwo();

	}

}
