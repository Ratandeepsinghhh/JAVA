

import java.util.Scanner;

public class BMI 
{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = in.nextInt();
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = in.nextDouble();
            
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = in.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) 
            {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) 
            {
                status[i] = "Normal weight";
            } 
            else if (bmi[i] >= 25 && bmi[i] <= 39.9) 
            {
                status[i] = "Overweight";
            } 
            else 
            {
                status[i] = "Obese";
            }
        }
        System.out.println("\nResults:");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < numberOfPersons; i++) 
        {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}
