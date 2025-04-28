package com.objectClassMethod.java;

class Student2
{
	int id=23;
	String name="Guptha";
}


public class HashCodeAndEqualsMethod {

	public static void main(String[] args) {
		
		Student2 s1=new Student2();
		
		System.out.println(s1.hashCode());
		
		Student2 s2=new Student2();
		
		int res=s2.hashCode();
		
		System.out.println(res);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);

	}

}
