/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>

Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___ */

import java.util.*;
public class Multiply
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Get user input for the number
        System.out.print("Enter an Integer (6-9): ");
        int number = in.nextInt();

        if (number < 6 || number > 9)
        {
            System.err.println("Invalid Input!!!");
            return;
        }

        // Define an array of 5 elements
        int arr[] = new int[10];

        // Loop through the array to store multiplication
        for (int i = 0; i < 10; i++)
        {
            arr[i] = number * (i + 1);
        }

        //  Loop through array to print the table
        for (int i = 0; i < 10; i++)
        {
            System.out.println(number + " * " + (i + 1) + " = " + arr[i]);
        }

        in.close(); // Close the scanner to avoid resource leak
    }
}