package com.multithreading_ProblemAndSolution.java;

public class ByUsingSynchronizesKeyWordMethod {

	public static void main(String[] args) throws Exception {
		
		BrickDairy1 bd=new BrickDairy1();
		
		Runnable r1=()->{
			for(int i=0;i<10000;i+=50)
			{
				//unloading the 50 bricks
				bd.increamentBrickCount();
			}
		};
		
		Runnable r3=()->{
				
			for(int i=0;i<15000;i+=50)
			{
				//unloading the 50 bricks
				bd.increamentBrickCount();
			}
			
		};
		
		Runnable r2=()->{
			
			for(int i=0;i<5000;i+=50)
			{
				//unloading the 50 bricks
				bd.increamentBrickCount();
			}
			
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
		
		Thread t3=new Thread(r3);
		t3.start();
		
		t1.join();
		
		t2.join();
		t3.join();
		
		System.out.println(bd.brickCount);
	}

}

class BrickDairy1
{
	int brickCount=0;
	public synchronized void increamentBrickCount()
	{
		brickCount+=50;
	}
	
	}
