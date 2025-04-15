import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter your name");
       String name = input.next();
       
       System.out.println("Enter your city");
       String fromCity = input.next();

       System.out.println("Enter from which city you are leaving ");
        String viaCity = input.next();
        System.out.println("Enter which city you are going ");
       String toCity = input.next();
       System.out.println("Enter the distance from via city");
       double distanceFromToVia = input.nextDouble();
        
       System.out.println("Enter the Time via city ");
       int timeFromToVia =input.nextInt();
        
       System.out.println("Enter the distance to final city ");
       double distanceViaToFinalCity =input.nextDouble();
 
       System.out.println("Enter the time final city ");
       int timeViaToFinalCity =input.nextInt();
 
       
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
 
       
       int totalTime = timeFromToVia + timeViaToFinalCity;
 
 
       
       System.out.println("The Total Distance travelled by " + name + " from " + 
                          fromCity + " to " + toCity + " via " + viaCity +
                          " is " + totalDistance + " km and " +
                          "the Total Time taken is " + totalTime + " minutes");
    }
 }
 

