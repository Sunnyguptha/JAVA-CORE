package com.nestedOrinnerclass.java;

class One
{
	static int i=34;
	public static void methodOne()
	{
		System.out.println(" from methodOne");
	}
	static class Two
	{
		public void methodTwo()
		{
			System.out.println(" from methodTwo");
			System.out.println("i="+i);
			methodOne();
		}
	}

}
public class Static_InnerClassEx3 {

	public static void main(String[] args) {
		
		One.Two t=new One.Two();
		t.methodTwo();
		

	}

}
