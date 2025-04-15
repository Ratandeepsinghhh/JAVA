/* Create a program to count the number of digits in an integer.*/

import java.util.*;

public class DigitCount 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number: "); // user input for number
        int number = in.nextInt();

        while (number != 0) // while loop till number is not equal to 0
        {
            number/= 10; // removing the last digit
            count++; // increamenting count
        }

        System.out.println("Number of digits: " + count); // printing count
    }
}