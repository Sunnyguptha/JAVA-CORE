package com.abstract_basic.java;


 abstract class Coaching{
	 public final int fee;
	 private String name;
	 protected String model;
	 
	 public Coaching() {
		 fee=2300;
		 name="sunny";
		 model="digrii";
		 System.out.println("from fee is fixed");
	 }
	 
	protected abstract void science();
	 
	 protected abstract void physic();
	 
	 public abstract void english();
	 
	protected final void classRoom() {
		 System.out.println("class room on second");
	 }
	 
	//public abstract static void displayInfo(); 
	protected static void displayInfo() {
		
	}
	
 }
 
 class Institute360 extends Coaching{

	@Override
	protected void science() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void physic() {
		System.out.println("from physic");
		
	}

	@Override
	public void english() {
		// TODO Auto-generated method stub
		
	}

	public void techer() {
		System.out.println("from teacher");
	}	 
 }

public class Basic2 {

	public static void main(String[] args) {
		
		
		
		Institute360 e=new Institute360();
		
		System.out.println(e.fee);
		e.physic();
		e.techer();
		e.english();
		
		      
		    			  
		    			  
		      
		    
		
	}
}
