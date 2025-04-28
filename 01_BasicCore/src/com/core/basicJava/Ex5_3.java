package com.core.basicJava;
//with parameter and without return
public class Ex5_3 {
	
	public void method(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Ex5_3 e=new Ex5_3();
		
		e.method(2, 4);

	}

}
