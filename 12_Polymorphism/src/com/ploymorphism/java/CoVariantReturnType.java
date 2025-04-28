package com.ploymorphism.java;

class NumberProvider {
    public Number getValue() {  // Superclass method returning Number (parent of Integer, Double, etc.)
        System.out.println("Returning a Number");
        return 100;  // Returning an Integer (subclass of Number)
    }
}

class IntegerProvider extends NumberProvider {
    @Override
    public Integer getValue() {  // Overridden method returning Integer (subclass of Number)
        System.out.println("Returning an Integer");
        return 200;
    }
}

public class CoVariantReturnType {
    public static void main(String[] args) {
        NumberProvider np = new IntegerProvider(); // Parent reference, child object
        System.out.println(np.getValue()); // Calls overridden method in IntegerProvider
    }
}
