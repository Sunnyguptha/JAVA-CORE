package com.objectClassMethod.java;



public class CloneMethodEx2 {
    public static void main(String[] args)throws CloneNotSupportedException {
       
            Employeer e = new Employeer();
            Object o = e.clone();
            System.out.println("Cloned object (using Object reference): " + o);

            Employeer e1 = (Employeer) o;
            System.out.println("Cloned Employee object: " + e1);
      
    }
}

class Employeer implements Cloneable {
    String name = "Guptha";
    int id = 36;

    // Overriding the clone() method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Overriding the toString() method for better output
    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + "]";
    }
}
