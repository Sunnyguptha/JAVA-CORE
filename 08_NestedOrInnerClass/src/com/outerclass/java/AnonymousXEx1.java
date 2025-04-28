package com.outerclass.java;

public class AnonymousXEx1 {

	private int i=34;
	public static void main(String[] args) {
		
		class1 c=new class1() {
			public void methodTwo()
			{
				System.out.println(" update from methodTwo");
			}
		};
		
		c.methodOne();
		c.methodTwo();
		
		
	}
}

class class1{
	public void methodOne()
	{
		System.out.println(" from method");
	}
	
	public void methodTwo()
	{
		System.out.println(" from methodTwo()");
		
	}
	
}

//class class2 extends class1
//{
//	public void methodTwo()
//	{
//		System.out.println(" update from methodTwo");
//	}
//}
