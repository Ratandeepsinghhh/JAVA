

import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int result = 1;
        System.out.print("Enter a number: "); // taking user input number
        int number = input.nextInt();
        System.out.print("Enter power: "); // taking user input for power
        int power = input.nextInt();

        if (number < 1 || power < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        for (int i = 1; i <= power; i++) // for loop from 1 to power
        {
            result*= number; // multipling number by itself and stoing in result
        }
        System.out.println("Result: " + result); // printing result
    }
}