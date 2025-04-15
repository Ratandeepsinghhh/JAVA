/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3

O/P => Is the first number the smallest? ____*/

import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        int number1 , number2 , number3;
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER ALL THE NUMBERS");
        number1=input.nextInt();
        number2=input.nextInt();
        number3=input.nextInt();
        System.out.print(" Is the first number the smallest? ");
        if(number1<number2 && number1<number3){
            System.out.print("Yes");
        }    
        else{
            System.out.print("No");
        }
    }   
}
