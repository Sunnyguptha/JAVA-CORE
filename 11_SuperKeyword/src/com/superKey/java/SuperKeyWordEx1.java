package com.superKey.java;



class Guest{
	public void read()
	{
		System.out.println(" from read");
	}
	
}

class Developer extends Guest{
	public void write()
	{
		System.out.println(" from write");
	}
}

class Admin extends Developer{
	public void manage()
	{
		super.read();
		write();
		System.out.println(" from manage");
	}
	
	public void read()
	{
		System.out.println(" read is by admin");
	}
}
public class SuperKeyWordEx1 {

	public static void main(String[] args) {
		
		Guest g=new Guest();
		g.read();
		
		Developer d=new Developer();
		d.read();
		d.write();
		
		Admin a=new Admin();
		a.read();
		a.write();
		a.manage();

	}

}
