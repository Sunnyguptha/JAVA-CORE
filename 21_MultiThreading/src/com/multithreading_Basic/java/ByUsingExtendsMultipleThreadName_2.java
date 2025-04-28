package com.multithreading_Basic.java;

public class ByUsingExtendsMultipleThreadName_2 {

	public static void main(String[] args) {
	
		Employee3 e=new Employee3("t1");
		//e.setName(" Employee");
		e.start();
		
		Manager1 m=new Manager1("t2");
		//m.setName("manager");
		m.start();
		
		System.out.println(Thread.activeCount());
		
	}

}

class Employee3 extends Thread
{
	public Employee3(String tName)
	{
		super(tName);
	}
	@Override
	public void run() {
		System.out.println("hello="+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
}

class Manager1 extends Thread
{
	public Manager1(String tName) {
		super(tName);
	}
	@Override
	public void run() {
		System.out.println("Bye="+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
	}
}