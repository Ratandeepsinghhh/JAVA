import java.util.Scanner;

public class MilesYards {
    public static void main(String[] args) {
        double distance_yards,distance_miles,distance_feets;
        System.out.println("Enter the distance in feets");
        Scanner input=new Scanner(System.in);
        distance_feets=input.nextDouble();
        distance_yards=(double)distance_feets/3;
        distance_miles=(double)distance_yards/1760;
        System.out.println("Your distance in feet is "+ distance_feets+ " While in yards and miles is " + distance_yards+" "+distance_miles);
    }
}
