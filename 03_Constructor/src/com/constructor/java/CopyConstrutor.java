package com.constructor.java;

public class CopyConstrutor {
		private String name;
		
		private int id;
		
		private double salary;
		
		public CopyConstrutor(String name ,int id,double salary)
		{
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		//copy constructor
	 public CopyConstrutor(CopyConstrutor other)
	 {
		 this.name=other.name;
		 this.id=other.id;
		 this.salary=other.salary;
	 }
	 //readable 
		public String toString()
		{
			return "name="+name+" "+"id="+id+" "+"salary="+salary;
		}
		public static void main(String[] args)
		{
			CopyConstrutor c=new CopyConstrutor("happy",34,324234.4);
			//create object of copy constructor and create object c1 as a copy of c object
			CopyConstrutor c1=new CopyConstrutor(c);
			
			System.out.println(c1);
			
			
		}
}
