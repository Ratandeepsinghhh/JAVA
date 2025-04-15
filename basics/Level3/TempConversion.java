import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        double celsius,farenheit;
        System.out.println("Enter the temperature in degree farenheit ");
        Scanner input=new Scanner(System.in);
        farenheit=input.nextDouble();
        celsius=(farenheit-32)* 5/9;
        System.out.println("The "+farenheit+" farenheit is "+celsius+" celsius ");
    }
}
