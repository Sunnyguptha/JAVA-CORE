package com.interfac_basci.java;

public class Example_01 {

	public static void main(String[] args) {
		//Demo d1=new B(); or
		B d1=new B();
		d1.m1();

	}

}

interface Demo{
	//public static final int a=12;  or
	int a=12;
	public abstract void m1();  // or void m1();
}
class B implements Demo{


	public void m1() {
		
		System.out.println(a);
		System.out.println("welcome to interface");
	}
	
}