package com.inheritance.java;

class Guest{
	
	public void read()
	{
		System.out.println(" read code updated");
	}
}

class Developer extends Guest
{
//	public void read()
//	{
//		System.out.println(" from read ");
//	}
	
	public void write()
	{
		System.out.println(" from wirte");
	}

}

class Admin extends Developer
{
//	public void read()
//	{
//		System.out.println("from read");
//	}
//	public void write()
//	{
//		System.out.println(" from write");
//	}
	public void manage()
	{
		System.out.println(" from manage");
	}

}


public class Multi_leveI_InheritanceEx3 {

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





