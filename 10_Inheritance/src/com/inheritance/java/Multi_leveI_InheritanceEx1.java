
package com.inheritance.java;
// Parent class (Super class)

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class (inherits from Animal)
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing...");
    }
}

// Grandchild class (inherits from Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Multi_leveI_InheritanceEx1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();    // Inherited from Animal class
        d.breathe(); // Inherited from Mammal class
        d.bark();   // Dog's own method
    }
}

/*	

	Parent 1
   |
Child 1  (inherits from Parent 1)
   |
Child 2  (inherits from Child 1)
   |
Child 3  (inherits from Child 2)

		
		
*/

/*

class Parent1 {
    void display() {
        System.out.println("I am the Parent.");
    }
}

class Child1 extends Parent1 {
    void show() {
        System.out.println("I am the First Child.");
    }
}

class Child2 extends Child1 {
    void print() {
        System.out.println("I am the Second Child.");
    }
}

class Child3 extends Child2 {
    void message() {
        System.out.println("I am the Third Child.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.display();  // Accessing Parent1 method
        obj.show();     // Accessing Child1 method
        obj.print();    // Accessing Child2 method
        obj.message();  // Accessing Child3 method
    }
}
*/



/*
 // Parent class
class Parent {
    String name;

    // Constructor for Parent class
    Parent(String name) {
        this.name = name;
    }

    // Method to display parent information
    void displayParentInfo() {
        System.out.println("Parent Name: " + name);
    }
}

// Son1 class inherits from Parent
class Son1 extends Parent {
    String hobby;

    // Constructor for Son1 class
    Son1(String name, String hobby) {
        super(name);  // Call Parent class constructor
        this.hobby = hobby;
    }

    // Method to display Son1 information
    void displaySon1Info() {
        System.out.println("Son1 Hobby: " + hobby);
    }
}

// Son2 class inherits from Son1 (which means it indirectly inherits from Parent)
class Son2 extends Son1 {
    String sport;

    // Constructor for Son2 class
    Son2(String name, String hobby, String sport) {
        super(name, hobby);  // Call Son1 class constructor
        this.sport = sport;
    }

    // Method to display Son2 information
    void displaySon2Info() {
        System.out.println("Son2 Sport: " + sport);
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of Son2
        Son2 son2 = new Son2("John", "Reading", "Football");

        // Calling methods from Parent, Son1, and Son2 classes
        son2.displayParentInfo();   // From Parent class
        son2.displaySon1Info();     // From Son1 class
        son2.displaySon2Info();     // From Son2 class
    }
}

 */





