
import java.util.*;
public class Multiple
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a number: "); // taking user input
        int number = input.nextInt();

        if (number < 1 || number >100) //checking if number is between 1 and 100
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        for (int i = 100; i >= 1; i--) // reverse for loop from 100 to 1
        {
            if (i % number == 0) // checking the divisibility
                System.out.println(i); // printing i
        }
    }
}