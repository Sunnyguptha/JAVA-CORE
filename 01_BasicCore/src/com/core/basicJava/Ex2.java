package com.core.basicJava;

public class Ex2 {
	int i=10;
	int j=20;
	public void methodOne()
	{
		System.out.println("from method");
	}
	public static void main(String[] args) {
		Ex2 e1=new Ex2();
		e1.methodOne();
		
		Ex2 e2=new Ex2();
		
		
		System.out.println(e1.i+"++++"+e1.j);
		System.out.println(e2.i+"++++++"+e2.j);
		
		e1.i=88;
		e1.j=99;
		
		System.out.println(e1.i+"======"+e1.j);
		System.out.println(e2.i+"========="+e2.j);

	}

}
