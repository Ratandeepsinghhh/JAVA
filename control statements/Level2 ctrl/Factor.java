/*Create a program to find the factors of a number taken as user input.
Hint => 
Get input value for a variable named number.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i. */

import java.util.*;
public class Factor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return; // terminating the program
        }

        for (int i = 1; i <= number; i++) // for loop from 1 to number
        {
            if (number % i == 0) // check if number is divisible by i
                System.out.println(i); // printing i
        }
    }
}