package com.constructor.java;

public class ConstructorChaining {

	private String name;
	private int id;
	
	public ConstructorChaining(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	//constructor chaining(call the other constructor )
	public ConstructorChaining()
	{
		this("sunny",343);

	}
	
	/*
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	*/
	
	
	//more reableable
	
	public String toString()
	{
		return "name="+name+" "+"id="+id;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining c=new ConstructorChaining();
		System.out.println(c);
		//System.out.println(c.getId());
		//System.out.println(c.getName());
		//System.out.println(c.getClass());
	

	}

}
