package com.core.basicJava;

public class Ex6 {
		private int eid;
		private String name;
		private int age;
		private double salary;
		
		public void setEid(int eid)
		{
			this.eid=eid;
		}
		public int getEid()
		{
			return eid;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		
		public void setAge(int age)
		{
			this.age=age;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public void setSalary(double salary)
		{
			this.salary=salary;
		}
		
		public double getSalary()
		{
			return salary;
		}

		public static void main(String[] args)
		{
		Ex6 e=new Ex6();
		e.setEid(23456);
		e.setName("Sunny");
		e.setAge(23);
		e.setSalary(300000);
		
		int res1=e.getEid();
		String res2=e.getName();
		int res3=e.getAge();
		
		double res4=e.getSalary();
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		}
		}
