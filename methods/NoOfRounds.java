
import java.util.Scanner;

public class NoOfRounds {
    public static int NoOfRounds(int distance,int parimeter){
        return distance/parimeter;
    }
    public static int parimeter(int a ,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.err.println("Eneter the  sides of triangular park : ");

        System.err.print("side a : ");
        int a=input.nextInt();
        System.err.print("side b : ");
        int b=input.nextInt();
        System.err.print("side c : ");
        int c=input.nextInt();

        int distance=5000;
        int p = parimeter(a, b, c);
        int r = NoOfRounds(distance, p);

        System.err.println("The no of rounds to be covered by the athlete : " + r); 


    }

}
