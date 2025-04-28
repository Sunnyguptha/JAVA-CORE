 package com.nestedOrinnerclass.java;

 class One3
 {
	 int i=39;
	 public void methodOne()
	 {
		 System.out.println(" from methdOne");
	 }
 }
 
public class Anonmymous_InnerClassEx1 {

	public static void main(String[] args) {
		
		One3 o=new One3(){
			public void methodOne()
			{
				System.out.println(" from methdoTwo");
			}
		};
		
		o.methodOne();
				
		
	}

}
