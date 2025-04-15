/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it */

import java.util.*;
public class YoungTall
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
		
		// taking user inout for age and height of Amar
        System.out.print("Enter age of Amar: ");
        int age_Amar = in.nextInt();
        System.out.print("Enter height of Amar: ");
        int height_Amar = in.nextInt();

		// taking user inout for age and height of Akbar
        System.out.print("Enter age of Akbar: ");
        int age_Akbar = in.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height_Akbar = in.nextInt();

		// taking user inout for age and height of Anthony
        System.out.print("Enter age of Anthony: ");
        int age_Anthony = in.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height_Anthony = in.nextInt();

		// Checking for the youngest and printing
        if (age_Amar < age_Akbar && age_Amar < age_Anthony)
            System.out.println("Youngest is Amar");
        else if (age_Akbar < age_Amar && age_Akbar < age_Anthony)
            System.out.println("Youngest is Akbar");
        else
        System.out.println("Youngest is Anthony");

		// Checking for the tallest and printing
        if (height_Amar > height_Akbar && height_Amar > height_Anthony)
            System.out.println("Tallest is Amar");
        else if (height_Akbar > height_Amar && height_Akbar > height_Anthony)
            System.out.println("Tallest is Akbar");
        else
        System.out.println("Tallest is Anthony");
    }
}