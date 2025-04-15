/* Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for number greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result */

import java.util.*;

public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        boolean isPrime = true; // making default value of isPrime as true

        for (int i = 2; i < number; i++) // for loop from 2 to number
        {
            if (number % i == 0) // checking if number is divisible by i
            {
                isPrime = false; // if the condition is true, than change isPrime to false
                break; // break the loop
            }
        }
        
        // Print the answer
        if (isPrime) 
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
    }
}