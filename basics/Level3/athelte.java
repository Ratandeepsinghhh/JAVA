import java.util.Scanner;

public class athelte {
    public static void main(String[] args) {
        float  side1, side2, side3,parameter,distance,rounds;
        distance=5000;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Sides of triangular park");
        side1=input.nextFloat();    
        side2=input.nextFloat();    
        side3=input.nextFloat();    
        parameter=side1+side2+side3;
        rounds=distance/parameter;
        System.out.println("The total number of rounds the athlete will run is " +rounds+ " to complete 5 Km ");
        
    }
}