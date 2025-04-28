package com.staticblock.java;

public class StaticBlockEx3 {
	static int i;
	
	static {
		i=20;
		System.out.println(" from static block");
		System.out.println(i);
	}
	
	public static void main(String[] args) {
	
		StaticBlockEx3 st=new StaticBlockEx3();
		
	}

}
