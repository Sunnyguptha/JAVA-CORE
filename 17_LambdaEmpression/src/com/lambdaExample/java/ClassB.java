package com.lambdaExample.java;

//single parameter
//multiple parameter

public class ClassB {

	public static void main(String[] args) {

		Ashoka a = new Ashoka();
		a.drive(40, "Ashoka");
		// anonymous class

		Bus b1 = new Bus() {
			public void drive(int s, String m) {
				System.out.println("bmw bus is called" + m);
			}
		};
		b1.drive(45, "bmw");

		// Lambda expression with anonymous function

		// Bus b2=(speed)

		Bus b2 = (speed, model) -> {
			System.out.println(" tata bus is called");
			System.out.println("bus is very good");
			if (speed < 100)
				System.out.println("normal speed good");
			else
				System.out.println("over speed bad please go slow");

		};

		b2.drive(78, "tata");
	}
}

class Ashoka implements Bus {

	@Override
	public void drive(int s, String m) {
		System.out.println(" ashoka bus is called"+m);

	}

}

@FunctionalInterface
interface Bus {
	void drive(int speed, String model);
}