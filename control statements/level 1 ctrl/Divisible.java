/*Write a program to check if a number is divisible by 5
I/P => number

O/P => Is the number ___ divisible by 5? ___*/
import java.util.Scanner;
public class Divisible 
{
    public static void main(String[] args) 
    {
        System.err.println("ENTER THE NUMBER TO BE CHECKED");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Is the number "+number+" divisible by 5 ? ");
        if(number%5==0){
            System.out.print(" YES");
        }
        else{
            System.err.print("NO");
        }
    }
}
