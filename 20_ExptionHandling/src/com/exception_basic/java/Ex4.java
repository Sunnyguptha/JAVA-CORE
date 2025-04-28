package com.exception_basic.java;

public class Ex4 {

	public static void main(String[] args) {
	
		try {
			int[] arr= {1,2,3,4,5};
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println("res="+arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//e.toString();
			System.out.println("invalid index kindly once rectifies");
		}
		
		System.out.println(10/0);
	
	}

}
