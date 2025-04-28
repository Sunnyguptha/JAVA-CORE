package com.constructor.java;

//zero parameter constructor
public class ConstructorEx3 {
		private int id;
		private String name;
		private double salary;
		
		public ConstructorEx3()
		{
			id=34;
			name="sunny";
			salary=343.5;
		}
		
		public void methodOne()
		{
			
			System.out.println(" from method");
			System.out.println(this.id);
			String name2=this.name;
			
			System.out.println(name2);
			
			System.out.println(this.salary);
			
			
		}
		
		public static void main(String[] args)
		{
			ConstructorEx3 c=new ConstructorEx3();
			c.methodOne();
		}
}
