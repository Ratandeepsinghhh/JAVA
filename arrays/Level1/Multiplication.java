

import java.util.*;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Get user input for the number
        System.out.print("Enter an Integer: ");
        int number = in.nextInt();

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