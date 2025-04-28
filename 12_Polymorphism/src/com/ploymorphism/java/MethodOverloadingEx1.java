package com.ploymorphism.java;

public class MethodOverloadingEx1 {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	public double add(double a,double b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
	
		MethodOverloadingEx1 e=new MethodOverloadingEx1();
		int res=e.add(23, 32);
//		e.add(3.2, 3.1);
//		e.add(21, 05, 70);
		
		System.out.println(res);
		System.out.println(e.add(3.2, 3.1));
		System.out.println(e.add(21, 05, 70));
	}

}
