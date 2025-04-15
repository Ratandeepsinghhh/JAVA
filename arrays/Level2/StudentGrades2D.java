

import java.util.*;

public class StudentGrades2D 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        double[][] marks = new double[numberOfStudents][3];  
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) 
            {
                double mark = -1;
                while (mark < 0) 
                {
                    if (j == 0) 
                    {
                        System.out.print("Enter marks for Physics: ");
                    } 
                    else if (j == 1) 
                    {
                        System.out.print("Enter marks for Chemistry: ");
                    } 
                    else 
                    {
                        System.out.print("Enter marks for Maths: ");
                    }

                    mark = in.nextDouble();
                    if (mark < 0) 
                    {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                }
                marks[i][j] = mark;  
            }
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            double percent = percentages[i];
            if (percent >= 80) 
            {
                grades[i] = "Grade A";
                System.out.println("Grade A");
                System.out.println("Remark: Level 4, above agency-normalized standards");
            } 
            else if (percent < 80 && percent >= 70) 
            {
                grades[i] = "Grade B";
                System.out.println("Grade B");
                System.out.println("Remark: Level 3, at agency-normalized standards");
            } 
            else if (percent < 70 && percent >= 60) 
            {
                grades[i] = "Grade C";
                System.out.println("Grade C");
                System.out.println("Remark: Level 2, below, but approaching agency-normalized standards");
            } 
            else if (percent < 60 && percent >= 50) 
            {
                grades[i] = "Grade D";
                System.out.println("Grade D");
                System.out.println("Remark: Level 1, well below agency-normalized standards");
            } 
            else if (percent < 50 && percent >= 40) 
            {
                grades[i] = "Grade E";
                System.out.println("Grade E");
                System.out.println("Remark: Level 1, too below agency-normalized standards");
            } 
            else 
            {
                grades[i] = "Grade R";
                System.out.println("Grade R");
                System.out.println("Remark: Remedial standards");
            }
            System.out.println();
        }
        System.out.println("\nMarks, Percentages, and Grades for each student:");
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }
    }
}