package com.nestedOrinnerclass.java;

class Farmer
{
	int i=30;
	
	public void methodOne()
	{
		System.out.println(" from field");
	}
	
	class Sunny
	{
		int j=23;
		public void methodTwo()
		{
			
			System.out.println(" from working..");
		}
		
	}

}

public class Member_InnerClassEx1 {

	public static void main(String[] args) {
		
		Farmer f=new Farmer();
		f.methodOne();
		
		System.out.println(f.i);
		Farmer.Sunny s=f.new Sunny();
		s.methodTwo();
		System.out.println(s.j);
		

	}

}
