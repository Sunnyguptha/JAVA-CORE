package com.inheritance.java;

interface Teacher2
{
	void teach();
}

interface Writer
{
	void write();
}
class Person1 implements Teacher2,Writer {
	 @Override
	public void teach()
	{
		System.out.println("Teaching Student..");
	}
	   @Override
	public void write()
	{
		System.out.println(" working a book");
	}
}


public class Multiple_InheritanceE1 {
public static void main(String[] args) {
	
	   Person1 p = new Person1();
       p.teach();  // Calls the method from Teacher interface
       p.write();  // Calls the method from Writer interface
}

}


/*	

p1		p2
__|_______|_
|	child	|
|___________|



Parent 1       Parent 2
    \            /
     \          /
     Child (inherits from both Parent 1 and Parent 2)

*/


/*
 interface Parent1 {
    void show();
}

interface Parent2 {
    void display();
}

class Child implements Parent1, Parent2 {
    public void show() {
        System.out.println("Show method from Parent1");
    }

    public void display() {
        System.out.println("Display method from Parent2");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
*/
