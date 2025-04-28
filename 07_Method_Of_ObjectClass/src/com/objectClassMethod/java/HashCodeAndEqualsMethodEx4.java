package com.objectClassMethod.java;

class Employee1
{
	int id;
	String name;
	
	public Employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
		
		System.out.println(" from constructor");
	}

	public String toString()
	{
		return "Employee1 {"+"id="+id+", name="+name+"}";
	}
}

public class HashCodeAndEqualsMethodEx4 {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(23,"sunny");
		
		System.out.println(e1);
		
		Employee1 e2=new Employee1(23,"sunny");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1==e2);
		
	}

}
