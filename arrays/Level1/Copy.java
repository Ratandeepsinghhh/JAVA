import java.util.*;
public class Copy
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        int index = 0;

        // Taking input from the user
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of Columns: ");
        int columns = input.nextInt();

        int array[] = new int[rows * columns];
        int arr[][] = new int[rows][columns];

        // Loop to take input for 2D array
        for (int i = 0; i < rows; i++)
        {
            System.out.println("Enter Elements of " + (i + 1) + " row: ");
            for (int j = 0; j < columns; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        // Loop to copy elements of 2D array to 1D array
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array[index] = arr[i][j];
                index++;
            }
        }
           
        System.out.println("1D Array:");
        for (int i = 0; i < index; i++)
        {
            System.out.print(array[i] +" ");
        }

        
    }
}