package com.constructor.java;


//zero constructor
public class ConstructorEx4 {
		private int id;
		private String name;
		private double salary;
		
		public ConstructorEx4()
		{
			 id=34;
			 name="sunny";
			 salary=3432.0;
		}
		
		public void display()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}
		public static void main(String[] args)
		{
			ConstructorEx4 e=new ConstructorEx4();
			e.display();
		}
}
