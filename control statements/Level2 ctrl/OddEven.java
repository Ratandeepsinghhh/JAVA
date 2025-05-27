

import java.util.*;
public class OddEven 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number: "); // taking user input
        int number = input.nextInt();

        if (number < 1) // checking for positive number
        {
            System.out.println("Not a Natural Number");
            return;
        }

        for (int i = 1; i <= number; i++) // for loop form 1 to number
        {
            if (i % 2 == 0) // checking if number is divisible by 2
                System.out.println(i +" :Even"); // Print if true
            else
            System.out.println(i +" :Odd"); // Print if false
        }
    }
}