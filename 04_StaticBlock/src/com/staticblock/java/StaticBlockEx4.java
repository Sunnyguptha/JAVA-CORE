package com.staticblock.java;

public class StaticBlockEx4 {
	
	static int i=10;
	int j=29;
	public static void main(String[] args) {
		System.out.println("main method");
		
		StaticBlockEx4 st=new StaticBlockEx4();
		System.out.println(st.j);
		
	}
	
	static {
		System.out.println(i);
		System.out.println(" from  static block");
		
		StaticBlockEx4 obj = new StaticBlockEx4();
        System.out.println("Accessing instance variable j in static block = " + obj.j);
		
	}
	
}
