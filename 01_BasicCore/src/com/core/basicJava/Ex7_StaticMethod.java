package com.core.basicJava;

public class Ex7_StaticMethod {
	static String name ="guptha";
	static int id=435;
	int reg=34;
	
	public static void methodOne()
	{
		System.out.println(name);
		System.out.println(id);
		
	}
	
	public static void main(String[] args)
	{
		Ex7_StaticMethod e=new Ex7_StaticMethod();
		
		e.methodOne();
		System.out.println(e.reg);
	}
	
}
