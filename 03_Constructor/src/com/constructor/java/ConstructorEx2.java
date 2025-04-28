package com.constructor.java;

//parameter constructor

public class ConstructorEx2 {
		private int id;
		private String name;
		private double salary;
		
		public ConstructorEx2(int id,String name,double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			
			 System.out.println("Parameter constructor called");
		}
		
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		
		}
		
		public double getSalary()
		{
			return salary;
		}
		// toString() bhi use kar skte h
		public static void main(String[] args) throws Exception
		{
			Class c=Class.forName("com.constructor.java.ConstructorEx2");
			Object o=c.getDeclaredConstructor(int.class,String.class,double.class).newInstance(23,"dew",54654.5);
			ConstructorEx2 e=(ConstructorEx2)o;
			System.out.println(e.getId());
			System.out.println(e.name);
			System.out.println(e.salary);
			
			
			
		}
}



//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        // Using reflection to create an instance of the Employeee class
//        Class c = Class.forName("Employeee");
//        Object o = c.getDeclaredConstructor().newInstance();
//        
//        // Correct way to cast the object
//        Employeee e = (Employeee) o;
//        
//        // Setting values using setter methods
//        e.setId(89);
//        e.setName("Guptha");
//        
//        // Printing the values
//        System.out.println("ID: " + e.getId());
//        System.out.println("Name: " + e.getName());
//        System.out.println(e); // Prints the object directly
//    }
//}

//class Employeee {
//    int id;
//    String name;
//
//    // Default constructor
//    public Employeee() {
//        System.out.println("Default constructor called");
//    }
//
//    // Parameterized constructor
//    public Employeee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // Overriding toString() to display the object meaningfully
//    @Override
//    public String toString() {
//        return "Employeee{id=" + id + ", name='" + name + "'}";
//    }
//}
