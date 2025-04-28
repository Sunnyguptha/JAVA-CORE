package com.multithreading_ProblemAndSolution.java;

//RaCE CONDITION PROBLEM
public class Ex1 {

	public static void main(String[] args) throws Exception {

		BrickDairy bd=new BrickDairy();
		
		//Thread t1=new Thread()
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
		
		System.out.println(bd.brickCount);
	}
}
class BrickDairy
{
	
	int brickCount=0;
	
	public void incrementBrickCount()
	{
		brickCount=brickCount+50;
	}
	
}


