package com.inheritance.java;

class Teacher
{
	int id;
	String name;
	char gender;
	String address;
	double salary;
	
	
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
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

class Students1 extends Teacher
{
	double fee;
	public void setFee(double fee )
	{
		this.fee=fee;
	}
	
	public double getFee()
	{
		return fee;
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		
		Students1 s=new Students1();
		s.setId(23);
		s.setName(" sunny");
		s.setGender('M');
		s.setAddress("hyderabad");
		s.setFee(334543.4);
		
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getAddress());
		System.out.println(s.getFee());
		

	}

}
