package com.encapsulation.java;

public class Student {

	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	public void setStudentAttendence(boolean flag)
	{
		if(!isAttended)
		isAttended =flag;
		System.out.println("teacher assigned attendence to student");
	
	}
	public boolean getStudentAttendence() {
		
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
