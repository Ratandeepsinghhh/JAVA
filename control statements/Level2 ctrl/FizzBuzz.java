/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint =>

Create a String Array to save the results and
Finally, loop again to show the results of the array based on the index position */

import java.util.*;
public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // taking user input
        System.out.print("Enter a number: "); 
        int number = in.nextInt();

        // checking for positive number
        if (number < 1) 
        {
            System.out.println("Not a Positive Number");
            return;
        }

        String results[] = new String[number];

        // for loop from 1 to number
        for (int i = 1; i <= number; i++) 
        {
			//Checking the conditions for FizzBuzz numbers
            if ((i % 3 ==0) && (i % 5 ==0))
            {
                results[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0)
            {
                results[i - 1] = "Fizz";
            }
            else if (i % 5 == 0)
            {   
                results[i - 1] = "Buzz";
            }
            else
            {
                results[i - 1] = String.valueOf(i);
            }
        }

        // Display the results in the required format
        for (int i = 0; i < number; i++) 
        {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        // Close the scanner
        in.close();
    }
}