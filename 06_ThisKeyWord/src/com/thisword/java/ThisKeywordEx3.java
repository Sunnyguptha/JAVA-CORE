package com.thisword.java;

public class ThisKeywordEx3 {
		
	
	public ThisKeywordEx3()
	{
		//first exceute
		System.out.println(" from contructor One");
	}
	public ThisKeywordEx3(int i)
	{
		this();//second exceute
		System.out.println(" from constructor Two");
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		ThisKeywordEx3 tk=new ThisKeywordEx3(54);
	}

}
