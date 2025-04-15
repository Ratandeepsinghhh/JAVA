
import java.util.*;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
         // Declare array of 10 elements of type double and a variable to store the sum
        double sum = 0.0;
        double[] number = new double[10];
        int index = 0;
        while(true)
        {
            // Ask user for input
            System.out.print("Enter number: ");
            double num = in.nextDouble();

            if (num <= 0 || index == 10)
            {
                break;
            }

            // Assign number to the array and increment the index
            number[index] = num;
            index++;
        }

        // Display all numbers entered
        System.out.println("Number entered:");
        for (int i = 0; i < index; i++)
        {
            System.out.print(number[i] + " ");
            sum += number[i];
        }

         // Display the total sum of the numbers
         System.out.println("\nTotal sum: " + sum);

        // Close the scanner object
         in.close();
        
    }
}