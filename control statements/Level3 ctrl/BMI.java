/* Create a program to find the BMI of a person */

import java.util.*;
public class BMI 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter Weight (in kg):"); // taking input weight in kg
        double weight = in.nextDouble();
        System.out.print("Enter Height (in cm):"); // taking input height in cm
        double height = in.nextDouble();
        double heightM = height / 100; // converting height from cm to meters

        double BMI = (weight / (heightM * heightM)); // Calculating BMI

        System.out.println("BMI: " + BMI);

		// Showing required status for the BMI
        if (BMI <= 18.4)
        {
            System.out.println("Status: Underweight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9)
        {
            System.out.println("Status: Normal");
        }
        else if (BMI >= 25.0 && BMI <= 39.9)
        {
            System.out.println("Status: Overweight");
        }
        else 
        {
            System.out.println("Status: Obese"); 
        }
    }
}
