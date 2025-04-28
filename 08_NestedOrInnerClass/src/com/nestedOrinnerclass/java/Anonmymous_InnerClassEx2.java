package com.nestedOrinnerclass.java;

class Shadhi
{
	int i=39;
	
	public void gorakhpure()
	{
		System.out.println(" From gorakhpure");
	}
	
}

public class Anonmymous_InnerClassEx2 {

	public static void main(String[] args) {
		
		Shadhi s=new Shadhi() {
			
			public void gorakhpure() {
				System.out.println(" from patKhaoli");
			}
		};
		
		s.gorakhpure();                                                      
		

	}

}
