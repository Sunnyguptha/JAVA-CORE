package com.inheritance.java;

// Interface 1
interface Teacher3 {
    void teach();
}

// Interface 2
interface Writer1 {
    void write();
}

// Implementing multiple interfaces
class Person2 implements Teacher3, Writer1 {
    
    // Instance variables
    String name;
    int age;
    
    // Static variable
    static String profession = "Educator & Author";

    // Constructor
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing methods from interfaces
    @Override
    public void teach() {
        System.out.println(name + " is teaching students.");
    }

    @Override
    public void write() {
        System.out.println(name + " is writing a book.");
    }

    // Instance method
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
    }
}

public class Multiple_InheritanceEx2 {
    public static void main(String[] args) {
        // Creating object with constructor
        Person2 p = new Person2("Sunny", 30);
        
        // Calling methods
        p.teach();
        p.write();
        p.showDetails();
    }
}
