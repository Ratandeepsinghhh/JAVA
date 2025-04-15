/* Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number */

import java.util.*;
public class OddEven 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Natural Number");
            return;
        }

        for (int i = 1; i <= number; i++) // for loop form 1 to number
        {
            if (i % 2 == 0) // checking if number is divisible by 2
                System.out.println(i +" :Even"); // Print if true
            else
            System.out.println(i +" :Odd"); // Print if false
        }
    }
}