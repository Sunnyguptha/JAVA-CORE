package com.multithreading_Basic.java;

public class ByUsingExtendsMultipleThreadEx1 {

	public static void main(String[] args) {
	
		Employee2 e=new Employee2();
		e.start();
		
		Manager m=new Manager();
		m.start();
		
		System.out.println(Thread.activeCount());
		
	}

}

class Employee2 extends Thread
{
	@Override
	public void run() {
		System.out.println("hello="+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	
		/*
		  Thread t=Thread.currentThread();
		System.out.println(" Thread Name="+t.getName());
		
		System.out.println(" thread id="+t.getId());
	*/
	}
}

class Manager extends Thread
{
	@Override
	public void run() {
		System.out.println("Bye="+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
}