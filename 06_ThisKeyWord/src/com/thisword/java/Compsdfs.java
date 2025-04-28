package com.thisword.java;


class Engine{
	int eNumber=34;
	String model="dsfs";
	public void methodOne() {
		System.out.println("from engine");
	}
}

class Car{
	Engine e;
	
	public void methodTwo() {
		e=new Engine();
		e.methodOne();
		System.out.println(e.eNumber);
		System.out.println(" from methodTwo");
	}
}

public class Compsdfs {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.methodTwo();

	}

}
