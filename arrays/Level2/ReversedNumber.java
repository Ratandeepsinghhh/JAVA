
import java.util.*;

public class ReversedNumber 
{
    public static void main(String[] args) 
    {   
        int[] digits = new int[10];
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int index = 0;
        while (number != 0) 
        {
            digits[index] = number % 10;
            number = number / 10;
            index++;
            
            if (index == 10) {
                break;
            }
        }
        System.out.println("Reversed number:");
        for (int i = 0; i < index; i++)
        {
            System.out.print(digits[i]);
        }
    }
}