package com.exception_basic.java;

public class Ex3 {

	public static void main(String[] args) {
		try
		{
			int[] arr= {1,2,3,4,5};
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println("result="+arr[i]);
				
			
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("bro invalid index");
			}
		

	}

}
