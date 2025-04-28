package com.abstract_basic.java;
abstract class Vehicle {

    // Instance variables (with different access modifiers)
    private String brand;
    protected String model;
    public final int wheels;

    // Final variable (must be initialized)
    public final String VEHICLE_TYPE = "Transport";

    // Constructor
    public Vehicle(String brand, String model, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;  // Initialized during object creation
        System.out.println("Vehicle Constructor: " + brand + " " + model + " with " + wheels + " wheels");
    }

    // Final method (cannot be overridden)
    public final void start() {
        System.out.println("Starting the vehicle...");
    }

    // Static method (belongs to the class, not the instance)
    public static void displayInfo() {
        System.out.println("This is a static method in an abstract class");
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void honk();

    // Getter method to access private variable
    public String getBrand() {
        return brand;
    }
}

// Concrete class extending the abstract class
class Car extends Vehicle {

    // Constructor of the subclass
    public Car(String brand, String model) {
        super(brand, model, 4);  // Calling the parent class constructor
    }

    // Implementation of the abstract method
    @Override
    public void honk() {
        System.out.println("Car honks: Beep Beep!");
    }
}

public class Basic {
    public static void main(String[] args) {
        // Calling static method directly using the class name
        Vehicle.displayInfo();

        // Creating an object of the subclass
        Car myCar = new Car("Toyota", "Corolla");
        myCar.start();               // Calling final method
        myCar.honk();                // Calling overridden abstract method
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.model);
        System.out.println("Wheels: " + myCar.wheels);
        System.out.println("Vehicle Type: " + myCar.VEHICLE_TYPE);

        // Trying to reassign final variable (uncomment to see the error)
        // myCar.VEHICLE_TYPE = "New Type";  // Error: cannot assign a value to final variable

        // Trying to change the value of wheels (uncomment to see the error)
        // myCar.wheels = 6;  // Error: cannot assign a value to final variable
    }
}
