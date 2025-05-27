/*Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount. */

import java.util.*;
public class Bonus 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        double total = 0.0, bonus = 0.0;
        System.out.print("Enter Salary: "); // taking salary as user input
        double salary = input.nextDouble();
        System.out.print("Enter Year: "); // taking years as user input
        int years = input.nextInt();

        if (years > 5) // check if years is greater than 5
        {
            bonus = 0.05 * salary; // calculate bonus
            total = salary + bonus; // calculate total salary
        }
        else
		{
            total = salary;
            bonus = 0;
		}
        System.out.println("bonus: " + bonus); // printing bonus
        System.out.println("Total amount: " + total); // printing total amount
    }
}