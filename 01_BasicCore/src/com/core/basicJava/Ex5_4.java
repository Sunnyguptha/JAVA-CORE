package com.core.basicJava;
//wth para and return
public class Ex5_4 {
	
	public int methodOne(int a,int b)
	{
		int c=a+b;
		
		return c;
		
	}
	
	public static void main(String[] args)
	{
		Ex5_4 e=new Ex5_4();
		
		int res=e.methodOne(3, 5);
		
		System.out.println(res);
		
		
	}
}
