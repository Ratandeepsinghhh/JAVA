

import java.util.*;
public class Multiplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number (6-9): "); // taking user input
        int number = input.nextInt();

        if (number < 6 || number > 9) // check if number is between 6 and 9
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        for (int i = 1; i <= 10; i++) // fro loop form 1 to 10
        {
            System.out.println(number + " * " + i + " = " + (number * i)); // printing the table of the number
        }
    }
}