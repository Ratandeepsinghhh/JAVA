import java.util.Scanner;

public class SimpleInterestCalculator {

   
    public static double getInput(String inputType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + inputType + ": ");
        return scanner.nextDouble();
    }


    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    
    public static void displayResult(double principal, double rate, double time, double simpleInterest) {
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }

    
    public static void main(String[] args) {
        double principal = getInput("Principal");
        double rate = getInput("Rate of Interest");
        double time = getInput("Time (in years)");

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        displayResult(principal, rate, time, simpleInterest);
    }
}
