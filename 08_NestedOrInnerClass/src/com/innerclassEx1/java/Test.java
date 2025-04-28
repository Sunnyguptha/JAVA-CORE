package com.innerclassEx1.java;

public class Test {

    public static void main(String[] args) {
        TestClass3 t = new TestClass3();
        System.out.println("Employee ID: " + t.getEmployeeId());
        t.getSalary();
        System.out.println(t.getEmployeeId());
    }

    
//	public class TestClass3 extends EmployeeAbstract{
//	
//	
//	@overide
//	public int getMark() {
//		return 66;
//		
//	}
//	 public void methodTwo() {
//		 System.out.println(" from methodTwo ");
//	 }
//	
//}

    
    
    // TestClass3 implementing EmployeeInterface correctly
    public static class TestClass3 implements EmployeeInterface {

        @Override
        public int getEmployeeId() {
            return 23;
        }

        @Override
        public void getSalary() {
            System.out.println("Salary details...");
        }
    }
    
    
}
