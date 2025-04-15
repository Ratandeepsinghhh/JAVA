/* Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code*/

import java.util.*;

public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: "); // taking user input
        int number = in.nextInt();
        int num =number; // storing number into num
        while (num != 0) // calculating sum 
        {
            int temp = num % 10;
            sum+= temp * temp * temp;
            num/= 10;
        }

        if (sum == number) // checking if summ is equal to number
            System.out.println("It's an Armstrong number");
        else
            System.out.println("It's not an Armstrong number");
    }
}