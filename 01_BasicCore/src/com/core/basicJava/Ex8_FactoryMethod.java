package com.core.basicJava;

class FactoryClass {
	public Ex8_Car createCar()
	{
		Ex8_Car c=new Ex8_Car();
		return c;
	}
}
public class Ex8_FactoryMethod
{
	public static void main()
	{
		FactoryClass f=new FactoryClass();
		
		f.createCar();
	}
}

