package com.funtionInterface.java;

public class User {

	public static void main(String[] args) {
		
		Car c=new Car() {

			@Override
			public void Drive() {
			System.out.println("drive is called");
				
			}
			
		};
		c.Drive();
		c.brake();
		c.model();
		Car.electrical();
		Car.ligth();

	}

}
