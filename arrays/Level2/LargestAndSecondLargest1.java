
import java.util.Scanner;

public class LargestAndSecondLargest1
{

    public static void main(String[] args) 
    {
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int index = 0;
        while (number != 0) 
        {
            digits[index] = number % 10;
            number = number / 10;
            index++;
            
            if (index == maxDigit) {
                maxDigit += 10;
                
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                digits = temp;
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
        } else 
        {
            System.out.println("The number doesn't have enough digits.");
        }
    }
}
