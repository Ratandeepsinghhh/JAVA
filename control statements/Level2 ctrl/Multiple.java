/*Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backwards: from i = 100 to i = 1.
Inside the loop, check if i perfectly divides number.
If true, print the number and continue the loop. */

import java.util.*;
public class Multiple
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();

        if (number < 1 || number >100) //checking if number is between 1 and 100
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        for (int i = 100; i >= 1; i--) // reverse for loop from 100 to 1
        {
            if (i % number == 0) // checking the divisibility
                System.out.println(i); // printing i
        }
    }
}