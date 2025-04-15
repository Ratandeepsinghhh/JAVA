/* Write a program to create a calculator using switch...case.*/

import java.util.*;

public class Calculator 
{
    public static void main(String[] args) 
    {  
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first number: "); // User input for 1st number
        double first = in.nextDouble();
        
        System.out.print("Enter the second number: "); // user input for 2nd number
        double second = in.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): "); // user input for operator
        String op = in.next();
        
        switch (op) 
        {
            case "+":
                System.out.println("Result: " + (first + second));  // Addition
                break;
            case "-":
                System.out.println("Result: " + (first - second));  // Subtraction
                break;
            case "*":
                System.out.println("Result: " + (first * second));  // Multiplication
                break;
            case "/":
                if (second != 0) 
                {
                    System.out.println("Result: " + (first / second));  // Division
                } 
                else 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");  // If the operator is invalid
                break;
        }
    }
}