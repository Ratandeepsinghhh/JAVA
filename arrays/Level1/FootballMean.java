

import java.util.*;
public class FootballMean
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Define an array of 11 elements
        double heights[] = new double[11];
        double sum = 0.0;

        // Loop through the array to get user input
        for (int i = 0; i < 11; i++)
        {
            System.out.print("Enter Height of player " + (i + 1) + ": ");
            double height = in.nextDouble();
            heights[i] = height;
        }

        //  Loop through array to calculate sum
        for (int i = 0; i <= 10; i++)
        {
            sum += heights[i];
        }

        System.out.print("Average Height of players : " + (float)(sum / 11.0));

        in.close(); // Close the scanner to avoid resource leak
    }
}

