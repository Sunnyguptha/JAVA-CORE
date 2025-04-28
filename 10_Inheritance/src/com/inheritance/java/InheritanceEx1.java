package com.inheritance.java;

class One { 
    int i = 10; // Instance variable

    public void methodOne() { 
        System.out.println("from methodOne"); 
    }
}

class Two extends One {  // Single Inheritance: Two inherits from One
    public void methodOne() { 
        System.err.println("from methTwo"); // Method Overriding
    }
}

public class InheritanceEx1 {
    public static void main(String[] args) {
        Two t = new Two();
        t.methodOne(); // Calls overridden method in class Two
    }
}
