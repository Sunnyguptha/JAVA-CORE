package com.multithreading_ProblemAndSolution.java;


public class ByUsingVoilatile {

	public static void main(String[] args) throws Exception {

		BrickDairy4 bd=new BrickDairy4();
		
		Runnable r1 = () -> {
			for (int i = 0; i < 10000; i+=50) {
				//unloading the 50 brick
				bd.incrementBrickCount();
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 5000; i+=50) {
				bd.incrementBrickCount();
			}
		};

		Runnable r3 = () -> {
			for (int i = 0; i < 1000; i+=50) {
				bd.incrementBrickCount();
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(bd.brickCount1);
		System.out.println(bd.brickCount2);
	}
}
class BrickDairy4
{
	
	volatile int brickCount1=0;
	volatile int brickCount2=0;
	
	public void incrementBrickCount()
	{
		brickCount1=brickCount1+50;
		brickCount2=brickCount2+50;
	}
	
}


