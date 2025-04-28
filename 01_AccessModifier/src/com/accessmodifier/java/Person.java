//package com.accessmodifier.java;
//
//public class Person {

//	public int rollNo=101;
//	
//	public Person()
//	{
//		rollNo=102;
//	}
//	
//	public void printRollNumber()
//	{
//		System.out.println(rollNo);
//	}
//	
//	private void abc()
//	{
//		printRollNumber();
//		System.out.println(rollNo);
//	}


//private  //class cannot be private

//package com.accessmodifier.java;
//
//	public class Person {	
//	
//	private int rollNo=101;
//	
////	private Person()
//	public Person()
//	{
//		rollNo=102;
//	}
//	
//	private void printRollNumber()
//	{
//		System.out.println(rollNo);
//	}
//	
//	public static void main(String[] args) {
//		Person s=new Person();
//	}
//	public void abc()
//	{
//		printRollNumber();
//	}
//}

//default  //class can b default

//package com.accessmodifier.java;
//public class Person {	
//	
//	  int rollNo=101;
//	
//
//	Person()
//	{
//		rollNo=102;
//	}
//	
//	 void printRollNumber()
//	{
//		System.out.println(rollNo);
//	}
//	
//	public static void main(String[] args) {
//		Person s=new Person();
//	}
//	public void abc()
//	{
//		printRollNumber();
//	}
//}

//protectd cannot be class

package com.accessmodifier.java;
public class Person {	
	
	  int rollNo=101;
	

	Person()
	{
		rollNo=102;
	}
	
	 void printRollNumber()
	{
		System.out.println(rollNo);
	}
	
	public static void main(String[] args) {
		Person s=new Person();
	}
	public void abc()
	{
		printRollNumber();
	}
}
