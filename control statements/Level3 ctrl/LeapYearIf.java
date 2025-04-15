/* Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators*/

import java.util.*;

public class LeapYearIf 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: "); // Taking year as user input
        int year = in.nextInt();

        if (year < 1582) // checking if year is less than 1582
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) // checking condition for leap year
        {
            System.out.println("Leap Year");
        }
           
        else 
        {
            System.out.println("Not a Leap Year");
        }
    }
}