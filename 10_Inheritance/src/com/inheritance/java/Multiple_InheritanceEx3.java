package com.inheritance.java;

interface Guest1
{
	void read();
}

interface Developer1
{
	void write();
}

interface Admin1 extends Guest1, Developer1
{
	void manage();
}
public class Multiple_InheritanceEx3 implements Admin1 {

	public static void main(String[] args) {
		  Multiple_InheritanceEx3 obj = new Multiple_InheritanceEx3();
	        obj.read();
	        obj.write();
	        obj.manage();
		
	}

	@Override
	public void read() {
		System.out.println(" from read");
		
	}

	@Override
	public void write() {
		System.out.println(" from write");
		
	}

	@Override
	public void manage() {
		System.out.println(" from manage");
		
	}

}
