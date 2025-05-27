

import java.util.*;
public class YoungTall
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
		
		// taking user inout for age and height of Amar
        System.out.print("Enter age of Amar: ");
        int age_Amar = input.nextInt();
        System.out.print("Enter height of Amar: ");
        int height_Amar = input.nextInt();

		// taking user inout for age and height of Akbar
        System.out.print("Enter age of Akbar: ");
        int age_Akbar = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height_Akbar = input.nextInt();

		// taking user inout for age and height of Anthony
        System.out.print("Enter age of Anthony: ");
        int age_Anthony = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height_Anthony = input.nextInt();

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