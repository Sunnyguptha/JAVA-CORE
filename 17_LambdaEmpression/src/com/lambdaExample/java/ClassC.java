package com.lambdaExample.java;

public class ClassC {

	public static void main(String[] args) {

		Hero a = new Hero();
		System.out.println(a.getSpeed());

		// anonymous class
		Bike b1 = new Bike() {
			public int getSpeed() {
				System.out.println("bmw bike is called");
				return 68;
			}
		};

		System.out.println(b1.getSpeed());

		// Lambda expression with anonymous function

		// here hardCoding
		
/*		Bike b2 = () -> {
			int speed = 34;

			System.out.println(" tata bus is called");
			System.out.println("bike is very good");
			if (speed < 100)
				System.out.println("normal speed good");
			else
				System.out.println("over speed bad please go slow");

			return speed;
		};

		System.out.println(b2.getSpeed());
	}
}

*/
		
		// Lambda expression with anonymous function
		
		Bike b2 = () -> 100; 
			
		System.out.println(b2.getSpeed());
	}
}
class Hero implements Bike {

	@Override
	public int getSpeed() {
		System.out.println(" Hero Bike is called");

		return 45;

	}

}

@FunctionalInterface
interface Bike {
	public int getSpeed();
}