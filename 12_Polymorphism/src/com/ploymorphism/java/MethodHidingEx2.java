package com.ploymorphism.java;

class Home
{
	public static void show()
	{
		System.out.println(" from super class");	
	}

}
class Family extends Home
{
	public static void show()
	{
		System.out.println(" from child class");
	}
}

public class MethodHidingEx2 {

	public static void main(String[] args) {
	
		Family f=new Family();
		
		f.show();
		
		Home h=new Home();
		h.show();
		
		Home h1=new Family();
		h1.show();
		
	}

}
