

import java.util.*;
public class GreatestFactor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int greatestFactor = 1;
        System.out.print("Enter a number: "); //taking user input
        int number = input.nextInt();

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