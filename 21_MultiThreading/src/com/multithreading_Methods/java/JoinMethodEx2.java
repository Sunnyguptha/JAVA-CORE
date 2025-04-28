package com.multithreading_Methods.java;

public class JoinMethodEx2 {

	public static void main(String[] args) {
		
		A2 t1=new A2();
		A2 t2=new A2();
		A2 t3=new A2();
		
		t1.setName("thread 1");
		t2.setName("thread 2");

		t3.setName("thread 3");

		
		t2.start();
		
		try {
		t2.join();
		}
		catch(InterruptedException e) {
			e.getStackTrace();
		}
		
		t1.start();
		t3.start();
		// 2 time main thread hold
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
		}
	}

}

class A2 extends Thread{
	
	public void run() {
		String name=Thread.currentThread().getName();
	
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
		}
	}
}
