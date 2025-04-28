package com.multithreading_Basic.java;

public class ByUsingAnonymousFuntion_Way3_And_4 {

	public static void main(String[] args) {

		//way 2 lambad class
		Runnable r1 = ()->{
			for(int i=10;i<10;i++) {
				System.out.println("hello=" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());
			}
		};
		
		Runnable r2 = ()->{
			for(int i=10;i<10;i++) {
				System.out.println("hi" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());
			}
	};
		Thread t1=new Thread(r1,"T1");
		Thread t2=new Thread(r2,"T2");
	
		t1.start();
		//t1.join();
		t2.start();
		
		System.out.println(Thread.activeCount());
		
	}
}
		
//way 1 annomyous inner class
	/*	
	 * convert into lambda expression
	 */
	
/*
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello=" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());
			}
		};

		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Bye=" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());
			}
		};

		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r2, "t1");
		t1.start();
		t2.start();
		System .out.println(Thread.activeCount());

	}

}



/*
 * class Employee4 implements Runnable {
 * 
 * @Override public void run() {
 * System.out.println("hello="+Thread.currentThread().getName()+" >>"+Thread.
 * currentThread().getId()); } }
 * 
 * //class Manager2 extends Thread implements Runnable
 * 
 * class Manager2 implements Runnable {
 * 
 * @Override public void run() {
 * System.out.println("Bye="+Thread.currentThread().getName()+" >>"+Thread.
 * currentThread().getId()); } }
 */