package com.objectClassMethod.java;
 
class Employees
{
	int id;
	String name;
	
	public Employees(int id,String name)
	{
		this.id=id;
		this.name=name;
		
		System.out.println(" from constructor");
	}
	
	public void display() {
		System.out.println(" from methodOne Working ");
	}
	
	public String toString()
	{
		return "Employees {"+" id="+id+", name="+name+"}";
	}
	public void finalize()
	{
		System.out.println(" finalized is called");
	}
	
}

 

public class FinalizedMethodEx1 {

	public static void main(String[] args) {
		
		Employees e=new Employees(23, "sunny");
		e.display();
		
		System.out.println(e);
		e=null;
		System.gc();

	}

}
