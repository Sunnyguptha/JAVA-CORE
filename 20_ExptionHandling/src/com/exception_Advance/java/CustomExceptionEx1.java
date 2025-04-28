package com.exception_Advance.java;

public class CustomExceptionEx1 {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0); // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            // Wrapping the original exception with a custom message
            throw new ArithmeticException("Division by zero error: " + e.getMessage());
            
        //	throw new ArithmeticException("stupid fellow,dont divide with zero");
        }
    }
}

/*
 // Simple custom exception class
class VotingException extends Exception {
    public VotingException(String message) {
        super(message);
    }
}

public class SimpleVotingDemo {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                // Throw the custom exception when age is less than 18
                throw new VotingException("You are not eligible to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (VotingException e) {
            // Catch and display the exception message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

 */
