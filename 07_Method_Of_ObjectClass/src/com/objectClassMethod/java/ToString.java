package com.objectClassMethod.java;

class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Student {"+"id="+id+","
				+ "name="+name+"}";
	}
}


public class ToString {

	public static void main(String[] args) {
		
		Student s=new Student(34,"sunny");
		System.out.println(s);
		

	}

}
