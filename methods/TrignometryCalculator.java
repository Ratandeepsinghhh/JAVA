import java.util.*;

class TrigonometryCalculator 
{
    // Returns sin, cos, tan values for given angle
    double[] calculate(double degrees) 
    {
        double radians = Math.toRadians(degrees);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        TrigonometryCalculator tc = new TrigonometryCalculator(); // Create Object

        System.out.print("Enter angle in degrees: ");
        double angle = in.nextDouble();

        double[] result = tc.calculate(angle); // Call Method
        System.out.printf("sin(%.2f) = %.4f\n", angle, result[0]);
        System.out.printf("cos(%.2f) = %.4f\n", angle, result[1]);
        System.out.printf("tan(%.2f) = %.4f\n", angle, result[2]);
    }
}