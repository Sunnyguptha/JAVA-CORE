package com.objectClassMethod.java;


class Student1 
{
	int id=23;
	String name="Sunny";
	public void method()
	{
		System.out.println("from getclass Method");
	}
	
}
public class GetClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		Student1 s1=new Student1();
		Class o =s1.getClass();
		
		System.out.println(o);
		
		String c=o.getName();
		
		System.out.println(c);
		
		
		
	}

}
