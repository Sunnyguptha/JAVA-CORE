package com.ploymorphism.java;

class Parent {
    public Object getMessage() { // Returning Object (superclass)
        System.out.println("Parent: Returning an Object");
        return "Hello from Parent";
    }
}

class Child extends Parent {
    @Override
    public String getMessage() { // Covariant return type (Object → String)
        System.out.println("Child: Returning a String");
        return "Hello from Child";
    }
}

public class Co_variant_return_typeEx1 {
    public static void main(String[] args) {
        Parent p = new Child(); // Parent reference, child object (Runtime Polymorphism)
        System.out.println(p.getMessage()); // Calls overridden method in Child
    }
}
