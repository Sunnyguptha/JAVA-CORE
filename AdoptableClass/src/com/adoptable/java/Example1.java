package com.adoptable.java;

//Step 1: Create an interface with multiple methods
interface Animal {
 void eat();
 void sleep();
 void makeSound();
}

//Step 2: Create an adapter class with default (empty) method implementations
abstract class AnimalAdapter implements Animal {
 public void eat() {}
 public void sleep() {}
 public void makeSound() {}
}

//Step 3: Create a subclass that only overrides the necessary method
class Dog extends AnimalAdapter {
 public void makeSound() {
     System.out.println("Dog barks!");
 }
}

public class Example1 {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.makeSound();  // Output: Dog barks!
 }
}
