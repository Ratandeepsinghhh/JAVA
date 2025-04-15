

import java.util.*;

public class NumberCheck 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        // Define an array of 5 elements
        int[] numbers = new int[5];

        // Get user input for the numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < 5; i++) 
        {
            if (numbers[i] > 0) 
            {
                // Check if positive number is even or odd
                if (numbers[i] % 2 == 0) 
                {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } 
                else 
                {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } 
            else if (numbers[i] < 0) 
            {
                System.out.println("The number " + numbers[i] + " is negative.");
            } 
            else 
            {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[4]) 
        {
            System.out.println("The first and last elements are equal.");
        } 
        else if (numbers[0] > numbers[4]) 
        {
            System.out.println("The first element is greater than the last element.");
        } 
        else 
        {
            System.out.println("The first element is less than the last element.");
        }

        in.close(); // Close the scanner to avoid resource leak
    }
}
