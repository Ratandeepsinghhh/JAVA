/* Create a program to check if a number taken from the user is a Harshad Number.*/

import java.util.*;

public class HarshadNumber 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();
        int num =number; // storing number in num
        while (num != 0) // while loop till num is not equal to 0
        {
            int temp = num % 10;
            sum+= temp; // summing the digits
            num/= 10;
        }

        if (number % sum == 0) // checking the condition for Harshad Number
            System.out.println("Its an Harshad Number");
        else
            System.out.println("Its not an Harshad Number");
    }
}