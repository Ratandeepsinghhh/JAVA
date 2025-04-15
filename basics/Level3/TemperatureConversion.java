import java.util.Scanner;
public class TemperatureConversion {

    public static void main(String[] args) {
        double celsius,farenheit;
        System.out.println("Enter the temperature in degree celsius");
        Scanner input=new Scanner(System.in);
        celsius=input.nextDouble();
        farenheit=(celsius*9/5) + 32;
        System.out.println("The "+celsius+" celsius is "+farenheit+" farenheit ");
    }
}