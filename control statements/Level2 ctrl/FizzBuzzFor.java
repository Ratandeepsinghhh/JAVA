
import java.util.*;
public class FizzBuzzFor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = input.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Positive Number");
            return;
        }

        for (int i = 1; i <= number; i++) // for loop from 1 to number
        {
			//Checking the conditions for FizzBuzz numbers and printing
            if ((i % 3 ==0) && (i % 5 ==0))
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {   
                System.out.println("Buzz");
            }
            
            else
            System.out.println(i); // Default output
        }
    }
}