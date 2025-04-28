package com.nestedOrinnerclass.java;

class Hvac
{

	static int i=34;
	static String name="jitender";
	
	public static void methodOne()
	{
		System.out.println(" fomr Hvac");
	}
	
	static class Jitnder
	{
		static int j=33;
		
		public static void methodTwo()
		{
			System.out.println(" from jitender");
			System.out.println("j"+ j);
			System.out.println(" i"+i);
			methodOne();
		}
	}

}



public class Static_InnerClassEx2 {

	public static void main(String[] args) {
	
		System.out.println(Hvac.Jitnder.j);
	Hvac.Jitnder.methodTwo();

	}

}
