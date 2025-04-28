package com.composition.java;

public class CompositionEx3 {
    public static void main(String[] args) {
        FordCar f = new FordCar();
        f.drive();
    }
}

class FordCar {
    final Engine5 e;

    // Constructor to initialize the Engine object
    public FordCar() {
        e = new Engine5();
    }

    public final void drive() {
        e.engine();
        System.out.println(e.getEnNo());
        System.out.println(e.getModelName());
        System.out.println("stop..");
    }
}

// Final class to prevent inheritance
final class Engine5 {
    private final int enNo = 34;
    private final String modelName = "Fordxt";

    public final void engine() {
        System.out.println("engine start..");
    }

    public int getEnNo() {
        return enNo;
    }

    public String getModelName() {
        return modelName;
    }
}
