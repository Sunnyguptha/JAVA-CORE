package com.objectandclass.java;

public class Test2 {

	public static void main(String[] args) throws Exception
	{
		
		
		Class c=Class.forName("com.objectandclass.java.Student");
		Object o=c.newInstance();
		
		System.out.println(o);
		
		Student s=(Student)o;
		s.methodOne();
		

	}

}
