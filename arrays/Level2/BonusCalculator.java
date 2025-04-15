

import java.util.*;

public class BonusCalculator 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) 
        {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = in.nextDouble();

                System.out.println("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = in.nextInt();
                if (salary[i] > 0 && yearsOfService[i] >= 0) 
                {
                    validInput = true;
                } 
                else 
                {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                }
            }
        }
        for (int i = 0; i < 10; i++) 
            if (yearsOfService[i] > 5) 
            {
                bonus[i] = salary[i] * 0.05; 
            } 
            else 
            {
				bonus[i] = salary[i] * 0.02; 
				newSalary[i] = salary[i] + bonus[i];
				totalBonus += bonus[i];
				totalOldSalary += salary[i];
				totalNewSalary += newSalary[i];
			}
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Salary: " + salary[i] + ", Years of Service: " + yearsOfService[i] + ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }
        in.close();
    }
}