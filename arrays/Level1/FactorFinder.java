

import java.util.*;
public class FactorFinder
{
	

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
		
        // Initializing the variables
        int maxFactor = 10;
        int factors[] = new int[maxFactor];
        int index = 0;

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        // Loop to find the factors
        for (int i = 1; i <=number; i++)
        {
            if (number % i == 0)
            {
                factors[index] = i;
                index++;
            }

            // If the index reaches the max size, resize the array
            if(index == maxFactor)
            {
                maxFactor *= 2;
            }
        }

        // Displaying the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) 
        {
            System.out.print(factors[i] + " ");
        }

        in.close();
    }
}