/* Create a program to check if a number is an Abundant Number.*/

import java.util.*;

public class AbundantNumber 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: "); // takinig user input
        int number = in.nextInt();
        
        for (int i = 1; i < number; i++) // running for loop from 1 to number-1
        {
            if (number % i == 0) // checking if number is perfectly divisible by i
                sum+= i; // summing i
        }

        if (sum > number) // checking the condition for AbundantNumber
            System.out.println("It's an Abundant Number");
        else
            System.out.println("It's not an Abundant Number");
    }
}