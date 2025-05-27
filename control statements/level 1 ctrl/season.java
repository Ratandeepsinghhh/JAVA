
import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day:");
        int day = input.nextInt();
        System.out.println("Enter the month:");
        int month = input.nextInt();

        if ((month == 3 && day >= 20) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }


    }
}
