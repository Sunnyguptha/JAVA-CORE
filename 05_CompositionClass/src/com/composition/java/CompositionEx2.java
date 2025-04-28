package com.composition.java;

class Engine
{
	int id=34;
	String name="ford";
	
	public void start()
	{
		System.out.println(" starting..");
		}
	
}

class Car
{
	Engine e;
	public void carMethod()
	{
		e=new Engine();
		
		e.start();
		
		System.out.println(e.id);
		System.out.println(e.name);
	}
}
public class CompositionEx2 {

	public static void main(String[] args) {

		Car c=new Car();
		c.carMethod();
				

	}

}
