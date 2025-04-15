/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint =>

Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index */

import java.util.*;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Get user input for the number
        System.out.print("Enter an Integer: ");
        int number = in.nextInt();

        if (number < 1)
        {
            System.err.println("Invalid Input!!!");
            return;
        }

        // Define arrays for odd and even numbers
        int odd[] = new int[(number / 2) + 1];
        int even[] = new int[(number / 2) + 1];
        int oddCount = 0, evenCount = 0;

        // Loop through the array to check each number
        for (int i = 1; i <= number; i++) 
            {
                if (i % 2 == 0) 
                {
                    even[evenCount] = i;
                    evenCount++;
                } 
                else 
                {
                    odd[oddCount] = i;
                    oddCount++;
                }
            } 
        
        // Print array of odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++)
        {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        // Print array of even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++)
        {
            System.out.print(even[i] + " ");
        }

        in.close(); // Close the scanner to avoid resource leak
    }
}