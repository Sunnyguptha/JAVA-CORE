package com.interfac_basci.java;

public class Example_04 {
    public static void main(String[] args) {
        Deepak d = new Deepak();
        d.physic();
        d.chemistry();
        d.sankrith();
        d.physic1();
        d.chemistry1();
        d.sankrith1();
        d.physic2();
        d.chemistry2();
        d.sankrith2();
        d.emcate();
        d.emcate1();
        d.emcate2();
        d.timming();
        d.timming1();
        d.timming2();
        d.methodOne();
    }
}

// Interface Education
interface Education {
    public static final int fee = 3900;

    public abstract void physic();
    public abstract void chemistry();
    public abstract void sankrith();

    default void emcate() {
        System.out.println("Education: EMCAT coaching is free");
    }

    default void timming() {
        bye();
        System.out.println("Education: Timing should be 10am to 1pm");
    }

    static void bye() {
        System.out.println("Education: Static timing method");
    }
}

// Interface Jntuh
interface Jntuh {
    public static final int fee = 3900;

    public abstract void physic1();
    public abstract void chemistry1();
    public abstract void sankrith1();

    default void emcate1() {
        System.out.println("Jntuh: EMCAT coaching is free");
    }

    default void timming1() {
        bye1();
        System.out.println("Jntuh: Timing should be 10am to 1pm");
    }

    static void bye1() {
        System.out.println("Jntuh: Static timing method");
    }
}

// Interface University
interface University {
    public static final int fee = 3900;

    public abstract void physic2();
    public abstract void chemistry2();
    public abstract void sankrith2();

    default void emcate2() {
        System.out.println("University: EMCAT coaching is free");
    }

    default void timming2() {
        bye2();
        System.out.println("University: Timing should be 10am to 1pm");
    }

    static void bye2() {
        System.out.println("University: Static timing method");
    }
}

// Base class Animal
class Animal {
    public void methodOne() {
        System.out.println("Animal: Hello");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    @Override
    public void methodOne() {
        super.methodOne(); // Call the parent class method
        System.out.println("Cat: Hi");
    }
}

// Class Deepak extending Cat and implementing interfaces
class Deepak extends Cat implements Education, Jntuh, University {

    @Override
    public void physic() {
        System.out.println("Deepak: Physics time is 19");
    }

    @Override
    public void chemistry() {
        System.out.println("Deepak: Chemistry time is 20");
    }

    @Override
    public void sankrith() {
        System.out.println("Deepak: Sanskrit time is 21");
    }

    @Override
    public void physic1() {
        System.out.println("Deepak: Jntuh Physics time is 22");
    }

    @Override
    public void chemistry1() {
        System.out.println("Deepak: Jntuh Chemistry time is 23");
    }

    @Override
    public void sankrith1() {
        System.out.println("Deepak: Jntuh Sanskrit time is 24");
    }

    @Override
    public void physic2() {
        System.out.println("Deepak: University Physics time is 25");
    }

    @Override
    public void chemistry2() {
        System.out.println("Deepak: University Chemistry time is 26");
    }

    @Override
    public void sankrith2() {
        System.out.println("Deepak: University Sanskrit time is 27");
    }
}
