
import java.util.*;

public class FriendsInfo 
{

    public static void main(String[] args) 
    {
       
        int[] ages = new int[3];
        double[] heights = new double[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("Enter the age of friend " + (i+1) + ": ");
            ages[i] = in.nextInt();
            System.out.print("Enter the height of friend " + (i+1) + " (in meters): ");
            heights[i] = in.nextDouble();
        }
        int youngestAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) 
        {
            if (ages[i] < youngestAge) 
            {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }
        double tallestHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) 
        {
            if (heights[i] > tallestHeight) 
            {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }
        System.out.println("\nThe youngest friend is friend " + (youngestIndex + 1) + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is friend " + (tallestIndex + 1) + " with height " + tallestHeight + " meters.");
    }
}