/* Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___  */

import java.util.*;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a number (6-9): "); // taking user input
        int number = in.nextInt();

        if (number < 6 || number > 9) // check if number is between 6 and 9
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        for (int i = 1; i <= 10; i++) // fro loop form 1 to 10
        {
            System.out.println(number + " * " + i + " = " + (number * i)); // printing the table of the number
        }
    }
}