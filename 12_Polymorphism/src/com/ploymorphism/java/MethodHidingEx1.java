 package com.ploymorphism.java;

class Employee{
	
public static void methodOne()
{
System.out.println(" from super methodOne");	
}
}
class Two extends Employee{
	public static void methodOne()
	{
		System.out.println(" from sub class methodOne");
	}
}
public class MethodHidingEx1 {

	public static void main(String[] args) {
		Two t=new Two();
		t.methodOne();

	}

}
