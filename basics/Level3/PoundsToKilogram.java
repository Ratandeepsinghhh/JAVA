import java.util.Scanner;

public class PoundsToKilogram {
    public static void main(String[] args) {
        
        double pounds,kilogram;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        pounds=input.nextDouble();
        kilogram=pounds*2.2;
        System.out.println("The weight of the person in pound is "+ pounds + " and in kg is "+kilogram);

    }
}
