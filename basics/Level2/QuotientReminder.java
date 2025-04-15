import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args) {
        double quotient , reminder , number1,number2;
        System.out.println("Enter the two numbers");
        Scanner input=new Scanner(System.in);
        number1 =input.nextDouble(); 
        number2 =input.nextDouble();
        quotient=number1/number2;
        reminder=number1%number2;
        System.out.println("The Quotient is " + quotient + "  and Reminder is "+ reminder +" of two number "+number1+" "+number2);
    }
}
