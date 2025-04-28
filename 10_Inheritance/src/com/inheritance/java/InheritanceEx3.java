package com.inheritance.java;
class Four
{
public Four(int i)
{
	System.out.println("super class Constructor ");
}
}
class Five extends Four{
	public Five()
	{
		//super(); implicity call
		super(45);// explicity call by parameterized
		System.out.println("sub class Constructor ");
	}
}

public class InheritanceEx3 {

	public static void main(String[] args) {
		
		Five f=new Five();

	}

}
