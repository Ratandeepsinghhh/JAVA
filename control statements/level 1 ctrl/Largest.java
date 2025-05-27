


import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int number1 , number2 , number3;
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER ALL THE NUMBERS");
        number1=input.nextInt();
        number2=input.nextInt();
        number3=input.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
    }
}
