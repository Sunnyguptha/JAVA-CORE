package com.thisword.java;

public class ThisKeyWordEx2 {
			
			int id;
			public ThisKeyWordEx2(int id)
			{
				this.id=id;
			}
			public void methodOne()
			{
				System.out.println(" from methodOne");
				System.out.println(id);
			}
			
			public void methodTwo()
			{
				this.methodOne();
				
				System.out.println(" from methodTwo");
			}
	
	public static void main(String[] args) {
		
		ThisKeyWordEx2 th=new ThisKeyWordEx2(57);
		th.methodTwo();

	}

}
