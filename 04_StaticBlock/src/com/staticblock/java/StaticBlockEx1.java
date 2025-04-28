package com.staticblock.java;

public class StaticBlockEx1 {
	int i;
	static int j;
	
	
	static {
		j=10;
		System.out.println(j);
		System.out.println(" from static block excute");
		
	}
	
	public StaticBlockEx1()
	{
		i=30;
	}
	public void methodOne()
	{
		System.out.println("from instance method="+i);
	}
	public static void methodTwo()
	{
		System.out.println(" from static method="+j);
	}
	
	public static void main(String[] args)
	{
		System.out.println("main from start");
		StaticBlockEx1 st=new StaticBlockEx1();
		st.methodOne();
		st.methodTwo();
		System.out.println("main from end");
	}
}
