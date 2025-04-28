package com.composition.java;


class A
{
	int i=10;
	public void methodOne()
	{
		System.out.println(" from methodOne");
	}
	
	public void methodTwo()
	{
		System.out.println(" from methodTwo");
	}
}

class B
{
	A a;
	
	public void methodThree()
	{
		a=new A();
		
		System.out.println(" from methodThree");
		a.methodOne();
	}
	
	public void methodFour()
	{
		System.out.println(" from methodFour");
		a.methodTwo();
		System.out.println(a.i);
	}
}


public class CompositionEx1 {

	public static void main(String[] args) {
		
		B b=new B();
		b.methodThree();
		b.methodFour();

	}

}
