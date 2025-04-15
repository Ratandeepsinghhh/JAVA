/* Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines */

import java.util.*;
public class Grade 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter Math marks:"); // Taking Maths marks
        double math = in.nextDouble();
        System.out.print("Enter Physics marks:"); // Taking Physics marks
        double physics = in.nextDouble();
        System.out.print("Enter Chemistry marks:"); // Taking Chemistry marks
        double chemistry = in.nextDouble();

        double percent = (math + physics + chemistry) / 3.0; // Calculating average

        System.out.println("Percentage: " + percent);
		
		// Grading to coresponding percent
        if (percent >= 80)
        {
            System.out.println("Grade A");
            System.out.println("Remark: Level 4, above agency-normalized standards");
        }
        else if (percent < 80 && percent >= 70)
        {
            System.out.println("Grade B");
            System.out.println("Remark: Level 3, at agency-normalized standards");
        }
        else if (percent < 70 && percent >=60)
        {
            System.out.println("Grade C");
            System.out.println("Remark: Level 2, below, but approaching agency-normalized standards");
        }
        else if (percent < 60 && percent >=50)
        {
            System.out.println("Grade D");
            System.out.println("Remark: Level 1, well below agency-normalized standards");
        }
        else if (percent < 50 && percent >=40)
        {
            System.out.println("Grade E");
            System.out.println("Remark: Level 1, too below agency-normalized standards");
        }
        else 
        {
            System.out.println("Grade R");
            System.out.println("Remark: Remedial standards"); 
        }
    }
}
