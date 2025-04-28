package com.ploymorphism.java;

class One5{
	
	public Object methodOne()
	{
		System.out.println(" class One methodOne");
		return null;
	}
}

class Two5 extends One5{
	
	public String methodTwo()
	{
		System.out.println(" from methodTwo");
		return null;
	}
	
}

public class Co_variant_return_typeEx2 {

	public static void main(String[] args) {
		
		Two5 t=new Two5();
		t.methodTwo();

	}

}
