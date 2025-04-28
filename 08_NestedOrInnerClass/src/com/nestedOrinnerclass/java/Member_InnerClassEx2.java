package com.nestedOrinnerclass.java;

class Software
{
	int i=34;
	String company="amzon";
	
	public void display()
	{
		System.out.println(" from soon");
	}

	class Sunny
	{
		int j=23;
		
		public void displayWork()
		{
			//Software.this.display();
			System.out.println(" work");
		}
	}
}


public class Member_InnerClassEx2 {

	public static void main(String[] args) {
		Software s=new Software();
		//s.display();
		
		Software.Sunny c=s.new Sunny();
		c.displayWork();

	}

}
