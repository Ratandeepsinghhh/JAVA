import java.util.*;

class DivisionCalculator 
{
    public static int[] divide(int number, int divisor) 
    {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        DivisionCalculator dc = new DivisionCalculator(); 

        System.out.print("Enter number: ");
        int number = in.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = in.nextInt();

        int[] result = dc.divide(number, divisor);
        System.out.println("Quotient = " + result[0] + ", Remainder = " + result[1]);
    }
}