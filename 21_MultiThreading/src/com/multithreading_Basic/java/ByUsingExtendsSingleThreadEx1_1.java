package com.multithreading_Basic.java;

public class ByUsingExtendsSingleThreadEx1_1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.start();
		
		System.out.println(Thread.activeCount());
	}

}

class Employee extends Thread{
	
	@Override
	public void run() {
		System.out.println(" hello");
	}
}