package com.ploymorphism.java;

class Employees {
    
    public void calculateSalary() {
        System.out.println(23006);
    }
    
     void officeSalary() {
        System.out.println("9am - 6pm");
    }
  
} 

class Temporary extends Employees {
    
    @Override
    public void calculateSalary() {
        System.out.println(30000);
    }
}

public class MethodOverridingEx1 {

    public static void main(String[] args) {
        Temporary t = new Temporary();
        t.calculateSalary();  // Calls overridden method from Temporary
        t.officeSalary();     // Calls inherited method from Employees
    }
}
