package com.constructor.java;

public class ConstructorOverloadingEx2 {
    private String name;
    private String gender;
    private int age;
    private String city;

    // Default Constructor
    public ConstructorOverloadingEx2() {
        this.name = "unknown name";
        this.gender = "unknown gender";
        this.age = 0;
        this.city = "unknown city";
    }

    // Constructor with one parameter
    public ConstructorOverloadingEx2(String name) {
        this.name = name;
        this.gender = "unknown gender";
        this.age = 0;
        this.city = "unknown city";
    }

    // Constructor with two parameters
    public ConstructorOverloadingEx2(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = 0;
        this.city = "unknown city";
    }

    // Constructor with four parameters (FIXED city assignment)
    public ConstructorOverloadingEx2(String name, String gender, int age, String city) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.city = city;  // Fixed: Assigned city correctly
    }

    // toString() method for displaying object values
    public String toString() {
        return "ConstructorOverloading { name=" + name + ", gender=" + gender + ", age=" + age + ", city=" + city + " }";
    }

    public static void main(String[] args) {
        ConstructorOverloadingEx2 co1 = new ConstructorOverloadingEx2();
        ConstructorOverloadingEx2 co2 = new ConstructorOverloadingEx2("Sunny");
        ConstructorOverloadingEx2 co3 = new ConstructorOverloadingEx2("Govind", "Male");
        ConstructorOverloadingEx2 co4 = new ConstructorOverloadingEx2("John", "Male", 34, "Hyderabad");

        // Displaying the objects
        System.out.println(co1);
        System.out.println(co2);
        System.out.println(co3);
        System.out.println(co4);
    }
}
