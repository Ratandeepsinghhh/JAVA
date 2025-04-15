//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = input.nextInt();
        if(number<0){
            System.out.println("The number is negative");
        }
        else if(number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is zero");
        }
    }
    
}
