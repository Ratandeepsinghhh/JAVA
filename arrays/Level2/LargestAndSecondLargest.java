
import java.util.*;

public class LargestAndSecondLargest 
{
    public static void main(String[] args) 
    {
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int index = 0;
        while (number != 0) 
        {
            digits[index] = number % 10;
            number = number / 10;
            index++;
            
            if (index == maxDigit) {
                break;
            }
        }
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) 
        {
            if (digits[i] > largest) 
            {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) 
            {
                secondLargest = digits[i];
            }
        }
        if (largest != -1 && secondLargest != -1) 
        {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } 
        else 
        {
            System.out.println("The number doesn't have enough digits.");
        }
    }
}