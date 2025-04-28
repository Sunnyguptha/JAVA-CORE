package com.nestedOrinnerclass.java;

class Prathabh
{
	int i=34;
	
	public void methodOne()
	{
		System.out.println(" from methodOne");
	}
	
	public void methodTwo()
	{
		System.out.println("from methodTwo");
		System.out.println(i);
		methodOne();
		class Ahmad
		{
			int j=34;
			
			public void methodThree()
			{
				System.out.println(" from Three");
				
			}
		}
		
		Ahmad a=new Ahmad();
		a.methodThree();
		System.out.println(a.j);
	}
	
	
	
	
	
}
public class Local_InnerClassEx2 {

	public static void main(String[] args) {
		
		Prathabh p=new Prathabh();
		p.methodTwo();

	}

}
