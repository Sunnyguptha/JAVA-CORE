package com.encapsulation.java;

public class Teacher {
public static void main(String[] args) {
	Student s=new Student(101);
//	s.isAttended=true;
	//sop("teacher assigned attendence to student");
	s.setStudentAttendence(true);
	s.getStudentAttendence();
	
}
}
