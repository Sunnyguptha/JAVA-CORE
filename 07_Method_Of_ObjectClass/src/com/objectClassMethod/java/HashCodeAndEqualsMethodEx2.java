package com.objectClassMethod.java;


public class HashCodeAndEqualsMethodEx2 {

	public static void main(String[] args) {
		
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		
		
	}

}
