/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result */

import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int result = 1;
        System.out.print("Enter a number: "); // taking user input number
        int number = in.nextInt();
        System.out.print("Enter power: "); // taking user input for power
        int power = in.nextInt();

        if (number < 1 || power < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        for (int i = 1; i <= power; i++) // for loop from 1 to power
        {
            result*= number; // multipling number by itself and stoing in result
        }
        System.out.println("Result: " + result); // printing result
    }
}