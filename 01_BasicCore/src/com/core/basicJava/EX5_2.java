package com.core.basicJava;
//wthout para and with return
public class EX5_2 {

	public int methodOne()
	{
		int a=20;
		int b=30;
		int c=a+b;
		return  c;
	}
	public static void main(String[] args) {
		
		EX5_2 e=new EX5_2();
		
		
		System.out.println("result="+e.methodOne());
	}

}
