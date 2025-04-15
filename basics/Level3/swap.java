import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int number1,number2,c;
        Scanner input=new Scanner(System.in);
        number1=input.nextInt();
        number2=input.nextInt();
        c=number1;
        number1=number2;
        number2=c;
        System.out.println("The swapped numbers are " );
    }
}
