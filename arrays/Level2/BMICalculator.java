import java.util.*;

public class BMICalculator 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = in.nextInt();
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];   
        for (int i = 0; i < number; i++) {
            double weight = -1;
            double height = -1;
            while (weight <= 0) 
            {
                System.out.print("Enter weight for person " + (i + 1) + " (positive value): ");
                weight = in.nextDouble();
                if (weight <= 0) 
                {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            }
            while (height <= 0) 
            {
                System.out.print("Enter height for person " + (i + 1) + " (positive value): ");
                height = in.nextDouble();
                if (height <= 0) 
                {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi < 18.5) 
            {
                weightStatus[i] = "Underweight";
            } 
            else if (bmi >= 18.5 && bmi < 24.9) 
            {
                weightStatus[i] = "Normal weight";
            } 
            else if (bmi >= 25 && bmi < 39.9) 
            {
                weightStatus[i] = "Overweight";
            } 
            
            else 
            {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI and Weight Status for each person:");
        for (int i = 0; i < number; i++) 
        {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
