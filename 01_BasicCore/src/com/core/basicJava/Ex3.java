 package com.core.basicJava;

public class Ex3 {
	
	int i=10;
	static int j=20;
	
	public void methodOne()
	{
		System.out.println("methodOne");
	}
	public static void main(String[] args)
	{
		Ex3 e1=new Ex3();
		
		e1.methodOne();
		
		Ex3 e2=new Ex3();
		
		System.out.println(e1.i+"+++++++"+e1.j);
		
		System.out.println(e2.i+"========="+e2.j);
		
		e1.i=88;
		e2.j=56;
		
		System.out.println(e1.i+"+++=++"+e1.j);
		System.out.println(e2.i+"======="+e2.j);
	}
}
