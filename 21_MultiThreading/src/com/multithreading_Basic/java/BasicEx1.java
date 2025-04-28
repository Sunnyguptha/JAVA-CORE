package com.multithreading_Basic.java;

public class BasicEx1 {

	public static void main(String[] args) {

		System.out.println("hello guys, good morning");
		/*
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(Thread.currentThread().getPriority());
	  			
	  			OR
	  */
		 Thread t = Thread.currentThread();
	      
	     // Printing thread details
	        System.out.println("Thread Name: " + t.getName());
	        System.out.println("Thread ID: " + t.getId());
	        System.out.println("Thread Priority: " + t.getPriority());
		
			}

}
