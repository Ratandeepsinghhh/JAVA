/*Rewrite the FizzBuzz program using while loop  */

import java.util.*;
public class FizzBuzzWhile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int i = 1;
       System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        while (i <= number) // while loop till i is less than number
        {
			//Checking the conditions for FizzBuzz numbers and printing
            if ((i % 3 ==0) && (i % 5 ==0))
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {   
                System.out.println("Buzz");
            }
            else
            System.out.println(i); // default output

            i++; // increamenting i
        }
    }
}