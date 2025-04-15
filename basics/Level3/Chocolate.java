import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        int numberOfchocolates, numberOfChildren,ChocolateDivision,remaining;  

        Scanner input=new Scanner(System.in);
        System.out.println("Eneter number of chocolates and number of children");
        numberOfChildren=input.nextInt();
        numberOfchocolates=input.nextInt();
        ChocolateDivision=numberOfchocolates/numberOfChildren;
        remaining=numberOfchocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+ChocolateDivision+"  and the number of remaining chocolates are "+remaining);
    }
}
