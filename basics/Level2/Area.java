import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double base, height , area_centimeters,area_inches;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        base=input.nextDouble();
        System.out.println("Enter the height of triangle");
        height=input.nextDouble();
        area_centimeters=(double)1/2*base*height;
        area_inches=(double)area_centimeters/2.54;
        System.out.println("Your area in cm is "+area_centimeters+" while in inches is "+area_inches);
    }
}