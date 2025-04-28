 package com.nestedOrinnerclass.java;

 class Mankind
 {
	 static int reg=33;
	 static String division="Glimstar";
	 
	 public static void methodOne()
	 {
		 System.out.println(" from mankind");
	 }
	 
	
	 static class Govind
	 {
		 String name="govind";
		 public void methodTwo()
		 {
			 System.out.println(" from govind ");
			 System.out.println(reg);
		
		 }
	 }
	 
 }
 
public class Static_InnerClassEx1 {
public static void main(String[] args) {
	
    Mankind m = new Mankind(); 
    m.methodOne();
    
    Mankind.Govind g1=new Mankind.Govind();
    Mankind.Govind g2 = new Mankind.Govind();  
    
    System.out.println(g1.hashCode());
    System.err.println(g2.hashCode());
    
    g1.methodTwo();	
}
}
