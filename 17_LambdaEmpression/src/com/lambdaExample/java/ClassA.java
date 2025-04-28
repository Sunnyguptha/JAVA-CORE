package com.lambdaExample.java;

public class ClassA {

	public static void main(String[] args) {
		
		
		Audi a=new Audi();
		a.drive();

		//anonymous Function
		
		Car c1=new Car() {
			public void drive()
			{
				System.out.println(" bmw drive is called");
			}
		};
		c1.drive();
		
		//lambda Expression with anonymous funtion
		
		Car c2=()-> System.out.println("tata drive id called");
				c2.drive();
				
				
	}

}

// tradition way
class Audi implements Car{

	@Override
	public void drive() {
	System.out.println(" audi drive");
		
	}
	
}

@FunctionalInterface
interface Car{
	void drive();
}
