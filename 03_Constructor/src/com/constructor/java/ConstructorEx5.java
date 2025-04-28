package com.constructor.java;


//parameter contrsuctor
public class ConstructorEx5 {

	private int id;
	private String name;
	private double salary;
	
	public ConstructorEx5()
	{
		id=34;
		name="sunny";
		salary=4353.5;
		
		System.out.println("zero constructor ");
	}
	
	public ConstructorEx5(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		System.out.println("parameter constructor");
	}
	
	public void display()
	{
		System.out.println("id=="+id);
		System.out.println("name=="+name);
		System.out.println("salary=="+salary);
	}
	
	public static void main(String[] args) 
	{
	ConstructorEx5 c=new ConstructorEx5();
	c.display();
	
	ConstructorEx5 c1=new ConstructorEx5(23,"govind",3432.5);
	
	c1.display();
	
	}

}
