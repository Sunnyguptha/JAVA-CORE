package com.funtionInterface.java;



public class Eample1 {

	public static void main(String[] args) {

		JavaIntership j=()->
			System.out.println("stipend 1 thousand");
			
			j.stipend();
			j.java();
			JavaIntership.sql();
			 System.out.println("open: " + j.opening(4));
			
	
		
	}
}

@FunctionalInterface
 interface JavaIntership{
	public static final int batch=01;
	
	public abstract void stipend();
	
	default  void java()
	{
		System.out.println("candidate should knowlegde on java");
	}
	static void sql() {
		System.out.println("candidate should knowledge on sql");
	}
	
	default int opening(int a) {
		return a;
	}
	
}
