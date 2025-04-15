/*Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use for loop */

import java.util.*;
public class FizzBuzzFor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        for (int i = 1; i <= number; i++) // for loop from 1 to number
        {
			//Checking the conditions for FizzBuzz numbers and printing
            if ((i % 3 ==0) && (i % 5 ==0))
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {   
                System.out.println("Buzz");
            }
            
            else
            System.out.println(i); // Default output
        }
    }
}