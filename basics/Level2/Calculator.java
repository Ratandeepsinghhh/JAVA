import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        float number1,number2 ,sum,diff,division,multiplication;
        Scanner input=new Scanner(System.in);
        number1=input.nextFloat();
        number2=input.nextFloat();
        sum=number1+number2;
        diff=number1+number2;
        multiplication=number1+number2;
        division=number1+number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +" is "+" "+sum+" "+" "+diff+" "+multiplication+" and "+" "+division);
    }
}
