package com.nestedOrinnerclass.java;

class One1{
	
	int i=34;
	public void methodOne()
	{
		System.out.println(" from methodOne");
	}
	class Two
	{
		String name="sunny";
		
		public void methdTwo()
		{
			System.out.println(" from two");
			System.out.println("i="+i);
			System.out.println("name="+name);
			methodOne();
		}
	}
}

public class Member_InnerClassEx3 {

	public static void main(String[] args) {
		
		One1 o=new One1();
		One1.Two t=o.new Two();
		t.methdTwo();

	}

}
