package com.multithreading_Basic.java;

class MyThread extends Thread {
    public void run() {
    	
        try {
            Thread.sleep(1000); // Make the thread run for a while
            System.out.println(Thread.currentThread().getName() + " is running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BasicEx3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Active Threads: " + Thread.activeCount());
    }
}
