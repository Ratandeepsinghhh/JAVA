import java.util.Scanner;

public class SideSquare {
    public static void main(String[] args) {
        double side_square,parameter;
        System.out.println("Enter the parameter of Square :");
        Scanner input=new Scanner(System.in);
        parameter=input.nextDouble();
        side_square=(double)parameter/4;
        System.out.println("The length of the side is "+ side_square + " whose perimeter is "+parameter);
    }
}
