package com.multithreading_Methods.java;

public class YieldMethod {

	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		//t1.setName("Phala thread");
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();

	}

}

class Thread1 extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
			Thread.yield();
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(name);
		}
	}
}

/*
 * package com.java;
public class ExceptionEx1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Extended-Thread-1");
        MyThread t2 = new MyThread("Extended-Thread-2");

        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
   MyThread(String name) {
       super(name);
  }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            // Yielding to give other threads a chance to execute
            Thread.yield();
        }
    }
}



 */
