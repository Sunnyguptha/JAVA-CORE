package com.interfac_basci.java;

public class Example_02 {
public static void main(String[] args) {
	
	Loan l1=new HomeLoan();
	
	Loan l2=new EducationLoan();
	
	
	Loan l3=new GoldLoan();
	
	
}
}

interface Loan
{
	int interset=2;
	void getLoan();
}

class HomeLoan implements Loan{

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		
	}
	
}

class EducationLoan implements Loan{

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		
	}
	
}

class GoldLoan implements Loan{

	@Override
	public void getLoan() {
		// TODO Auto-generated method stub
		
	}
	
}