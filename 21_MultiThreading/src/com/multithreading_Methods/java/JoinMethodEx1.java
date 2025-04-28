package com.multithreading_Methods.java;

public class JoinMethodEx1 {

	public static void main(String[] args) throws Exception {

		Runnable r1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("hi=" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());

			}
		};

		Runnable r2 = () -> {
			for (int i = 1; i <= 20; i++) {
				System.out
						.println("hello=" + Thread.currentThread().getName() + " >>" + Thread.currentThread().getId());

			}
		};

		Thread t1 = new Thread(r1,"t1");
		t1.join();
		t1.start();

		Thread t2 = new Thread(r2,"t2");
		t2.start();

	}
}
/*
 * 
 * random output
 */
/*
 * Runnable r1 = ()->{
 * 
 * for(int i=1;i<=10;i++) { System.out.println("hello=" +
 * Thread.currentThread().getName() + " >>" + Thread.currentThread().getId()); }
 * };
 * 
 * Runnable r2 = ()->{ for(int i=1;i<=20;i++) { System.out.println("hi=" +
 * Thread.currentThread().getName() + " >>" + Thread.currentThread().getId()); }
 * }; Thread t1=new Thread(r1,"T1"); Thread t2=new Thread(r2,"T2");
 * 
 * t1.start(); t2.start();
 * 
 * System.out.println(Thread.activeCount());
 * 
 * 
 * }
 * 
 * }
 * 
 */

//	YouTube by learn code



