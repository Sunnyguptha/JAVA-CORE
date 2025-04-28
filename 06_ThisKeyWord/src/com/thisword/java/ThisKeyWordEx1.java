package com.thisword.java;

public class ThisKeyWordEx1 {
		int eid;
		String name;
		double salary;
		
		public ThisKeyWordEx1(int eid,String name,double salary)
		{
			this.eid=eid;
			this.name=name;
			this.salary=salary;
		}
		
		public void methodOne()
		{
			System.out.println("from method");
			System.out.println(eid+" "+name+" "+salary);
		}
		
		public static void main(String[] args)
		{
			ThisKeyWordEx1 tk=new ThisKeyWordEx1(12,"sunny",3423.5);
			tk.methodOne();
			
		}
}
