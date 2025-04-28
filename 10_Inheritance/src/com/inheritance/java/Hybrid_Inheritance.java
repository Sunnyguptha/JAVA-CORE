package com.inheritance.java;

//Base interface
interface Animal2 {
 void eat();
}

//Another interface
interface Pet {
 void play();
}

//Parent class implementing Animal
class Dog1 implements Animal2 {
 @Override
 public void eat() {
     System.out.println("Dog is eating...");
 }
}

//Child class inheriting Dog and implementing Pet
class Puppy extends Dog1 implements Pet {
 @Override
 public void play() {
     System.out.println("Puppy is playing...");
 }
}

public class Hybrid_Inheritance {
 public static void main(String[] args) {
     Puppy myPuppy = new Puppy();
     myPuppy.eat();  // Inherited from Dog
     myPuppy.play(); // Implemented from Pet
 }
}



/*
//Grandparent class
class Grandparent {
 void greet() {
     System.out.println("Hello from Grandparent!");
 }
}

//Parent1 interface
interface Parent1 {
 void show();
}

//Parent2 interface
interface Parent2 {
 void display();
}

//Parent class that extends Grandparent and implements Parent1 and Parent2
class Parent extends Grandparent implements Parent1, Parent2 {
 // Implementing show method from Parent1 interface
 public void show() {
     System.out.println("Show method from Parent1");
 }

 // Implementing display method from Parent2 interface
 public void display() {
     System.out.println("Display method from Parent2");
 }
}

//Child class that extends Parent
class Child extends Parent {
 void message() {
     System.out.println("Message from Child");
 }
}

public class HybridInheritanceExample {
 public static void main(String[] args) {
     // Create an object of Child class
     Child obj = new Child();

     // Accessing methods from the entire inheritance chain
     obj.greet();      // From Grandparent class
     obj.show();       // From Parent1 interface
     obj.display();    // From Parent2 interface
     obj.message();    // From Child class
 }
}
*/