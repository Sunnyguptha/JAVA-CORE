package com.staticblock.java;

public class StaticBlockEx2 {

	static int i;
	
	public void methodOne()
	{
		System.out.println(" from methodOne");
	}
	public StaticBlockEx2()
	{
		System.out.println(" from constructor excute");
	}
	static {
		i=29;
		System.out.println(i);
		System.out.println(" from static block");
	}
	
	
	public static void main(String[] args) {
		StaticBlockEx2 st1=new StaticBlockEx2();
		st1.methodOne();
		StaticBlockEx2 st2=new StaticBlockEx2();
		st2.methodOne();
	}

}
