/*Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop */

import java.util.*;
public class GreatestFactor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int greatestFactor = 1;
        System.out.print("Enter a number: "); //taking user input
        int number = in.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        for (int i = number - 1; i >= 1; i--) // reverse for loop from number +-1 to 1
        {
            if (number % i == 0) // checking if number is divisible by i
            {
                greatestFactor = i; // storing i in greatestFactor
                break; // exiting the loop
            }
        }
        System.out.println("The Greatest Factor: " + greatestFactor);
    }
}