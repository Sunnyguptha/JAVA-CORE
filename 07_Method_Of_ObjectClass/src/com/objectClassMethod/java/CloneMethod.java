package com.objectClassMethod.java;

class Employee implements Cloneable
{
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(" from constructor");
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Object o=super.clone();
		return o;
	}
}

public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e=new Employee(23,"sunny");
		Object o1=e.clone();
		
		System.out.println(o1);
		
		Employee e1= (Employee)e.clone();
		
		System.out.println(e==e1);
		System.out.println(e.equals(e1));
		
		System.out.println(e.id+ " "+e.name);
		System.out.println(e1.id+ " "+e1.name);
		
		
	}

}
