package com.thisword.java;

public class ThisKeywordEx4 {
	

	
	public ThisKeywordEx4()
	{
		this(56);	//secound exceute
		System.out.println(" from constructor one");
	}
	
	public ThisKeywordEx4(int i)
	{
	//first exceute
		System.out.println("from constructor two");
	}
	
	public static void main(String[] args) {
		
		ThisKeywordEx4 th=new ThisKeywordEx4();
		
		

	}

}
