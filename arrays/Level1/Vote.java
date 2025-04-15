/* Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>

Define an array of 10 integer elements and take user input for the student's age.
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. */

import java.util.*;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

         // Define an array of 10 elements
        int[] ArrAge = new int[10];

        // Get user input for the numbers
        System.out.println("Enter the age of students:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Student " + (i + 1) + ": ");
            ArrAge[i] = in.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < 10; i++)
        {
            if (ArrAge[i] < 0)
            {
                System.out.println("Invalid Age");
            }
            else if (ArrAge[i] >= 18)
            {
                System.out.println("The student with the age " + ArrAge[i] + " can vote");
            }
            else
            {
                System.out.println("The student with the age " + ArrAge[i] + " cannot vote");
            }
        }
        in.close(); // Close the scanner to avoid resource leak
    }
}