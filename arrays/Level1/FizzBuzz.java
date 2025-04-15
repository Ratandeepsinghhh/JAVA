

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