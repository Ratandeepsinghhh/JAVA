/* Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.*/

import java.util.*;

public class DayOfWeek 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        
        // Inputs
        System.out.print("Enter day: "); // user inout for day
        int d = in.nextInt();
        System.out.print("Enter month: "); // user inout for month
        int m = in.nextInt();
        System.out.print("Enter year: "); // user input for year
        int y = in.nextInt();

        // Adjust for January and February being treated as months 13 and 14 of the previous year
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        // Apply Zeller's Congruence formula to calculate the day of the week
        int h = (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;

        // Adjust the result to match the required output format (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int result = (h + 5) % 7;

        // Print the result (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println(result);
    }
}
