package com.multithreading_Methods.java;

public class SleepMethodEx2 {

	public static void main(String[] args) {
		
		A t1=new A();
		A t2=new A();
		A t3=new A();
		
		t1.setName("thread 1");
		t2.setName("thread 2");

		t3.setName("thread 3");

		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class A extends Thread{
	
	public void run() {
		String name=Thread.currentThread().getName();
	
		for(int i=1;i<=3;i++)
		{
			
		System.out.println(name);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}

