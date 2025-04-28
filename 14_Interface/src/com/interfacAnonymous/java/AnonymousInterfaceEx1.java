package com.interfacAnonymous.java;

public class AnonymousInterfaceEx1 {

	public static void main(String[] args) {
		
		Student s=new Student() {


			public void attend() {	
				System.out.println(" students attended");
			}

			@Override
			public int getMark() {
			
				return 20;
			}
			
		};
		
		s.attend();
		int res=s.getMark();
		System.out.println(res);
		
	}

}


//class Class1 implements Student{
//
//	@Override
//	public void attend() {
//		
//		
//	}
//
//	@Override
//	public int getMark() {
//	
//		return 0;
//	}
//}