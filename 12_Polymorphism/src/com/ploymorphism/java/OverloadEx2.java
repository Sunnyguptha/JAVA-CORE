package com.ploymorphism.java;

public class OverloadEx2 {

	public static void main(String[] args) {
		Calculate c=new Calculate();
		// Instance method overloading
		System.out.println(c.add(1,2));
		System.out.println(c.add(1.9,2.4));
		System.out.println(c.add(1,2,3));
		 // Static method overloading
		Calculate .display("Hello World");  // Calls String version
		Calculate .display(123);            // Calls int version

        // Final method overloading
        c.print("Java");
        c.print("Java", 3);
		
		
	}

}

class Calculate{
	public int add(int a,int b) {
		  System.out.println("Adding two integers:");
		return a+b;
	}
	double add(double a,double b) {
		 System.out.println("Adding two doubles:");
		return a+b;
	}
	int add(int a,int b,int c)
	{
		 System.out.println("Adding three interger:");
		 return a+b+c;
	}
	 // Overloaded static method
	static void display(String message) {
		  System.out.println("Message: " + message);
	}
	
	static void display(int number)
	{
		System.out.println("Number:-"+number);
	}
	// Final method - can be overloaded
	public final void print(String text)
	{
		
		System.out.println("Printing: " + text);
	}
	
	public final void print(String text, int time)
	{
		for(int i=0;i<time;i++)
		{
			System.out.println("Printing: " + text);
		}
	}
	
	// Overloaded constructor
	Calculate(){
		System.out.println("default constructor");
	}
	
	Calculate(int x){
		System.out.println("parameterid constructor");
	}
	
}
