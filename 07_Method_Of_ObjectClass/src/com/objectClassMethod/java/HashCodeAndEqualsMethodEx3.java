package com.objectClassMethod.java;

public class HashCodeAndEqualsMethodEx3 {

	public static void main(String[] args) {
		
		String s1=new String("welcome");
		String s2=new String("hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));

	}

}
