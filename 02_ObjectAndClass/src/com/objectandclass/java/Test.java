package com.objectandclass.java;

public class Test {

	

	public static void main(String[] args) throws Exception  {
		
		Class c=Class.forName("com.objectandclass.java.Employee");
		
		System.out.println(c);
		
		Object o=c.newInstance();
		
		
		Employee e=(Employee)o;
		
		e.methodOne();
		
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.salary);
		
	}

}
