package com.inheritance.java;

class Person{
	
	int id;
	String name;
	char gender;
	String address;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
}



class Student extends Person
{
	double fee;
	 public void setFee(double fee) { 
		 this.fee = fee; 
		 }
	    public double getFee() {
	    	return fee; 
	    }
}

class Teachers extends Person{
	
	double salary;
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Teachers t=new Teachers();
		t.setId(34);
		t.setName("sunny");
		t.setGender('m');
		t.setAddress("hyderabad");
		t.setSalary(3423242);
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getGender());
		System.out.println(t.getAddress());
		System.out.println(t.getSalary());

	}

}


/*
 *             Parent
           /    \
      Child1    Child2
*/

/*
 * // Parent class
class Parent {
    void greet() {
        System.out.println("Hello from Parent!");
    }
}

// Child1 class inherits from Parent
class Child1 extends Parent {
    void show() {
        System.out.println("Show method from Child1");
    }
}

// Child2 class inherits from Parent
class Child2 extends Parent {
    void display() {
        System.out.println("Display method from Child2");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Creating objects of Child1 and Child2
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        // Calling methods from Parent and Child classes
        obj1.greet();    // Inherited from Parent
        obj1.show();     // Specific to Child1
        
        obj2.greet();    // Inherited from Parent
        obj2.display();  // Specific to Child2
    }
}
*/
