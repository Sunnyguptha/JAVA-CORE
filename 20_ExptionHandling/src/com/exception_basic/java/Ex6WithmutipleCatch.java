package com.exception_basic.java;

public class Ex6WithmutipleCatch {

	public static void main(String[] args) {
	
		        try {
		            int[] arr = {1, 2, 3};
		            System.out.println(arr[5]); // Trying to access an invalid index (out of bounds)
		        } 
		        catch (ArithmeticException e1) {
		            System.out.println("ArithmeticException caught");
		        } 
		        catch (NullPointerException e2) {
		            System.out.println("NullPointerException caught");
		        } 
		        catch (Exception e3) {
		            System.out.println("General Exception caught: " + e3);
		        }
		    


	}

}
