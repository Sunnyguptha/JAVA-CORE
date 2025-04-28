package com.abstractExample2.java;

public abstract class SampleAc2 implements Vehicle {
    
	 int i;
	 
	 public SampleAc2(){
		 
		 i=34;
	 }
	 
    public void door() {
        System.out.println("tata door code");
    }

    public void tyre() { 
    	System.out.println(" tata tyre code");
    }

    public abstract void brake();

    public abstract void light(); 
}



