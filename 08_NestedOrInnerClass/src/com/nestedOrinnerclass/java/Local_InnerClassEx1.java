package com.nestedOrinnerclass.java;

class One2
{
	int i=39;
	
	public void methodOne()
	{
		System.out.println(" from methodOne");
	}
	public void methodTwo()
	{
		System.out.println(" from methodTwo");
		
		methodOne();
		
		System.out.println("i="+i);
		class Two
		{
			int j=34;
			public void methodThree()
			{
				System.out.println(" from methodTrhree");
			}
		}
		
		Two t=new Two();
		t.methodThree();
	}
}

public class Local_InnerClassEx1 {
public static void main(String[] args) {
	
	One2 o=new One2();
	o.methodTwo();
}
}
