import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = input.nextInt();

        if (n > 0) { 
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of first " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        
    }
}
