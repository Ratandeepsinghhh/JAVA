import java.util.*;

class MinMax
{
    
    public static int[] getMinMax(int a, int b, int c) 
    {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        MinMax minmax = new MinMax(); 

        System.out.print("Enter 3 integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] result = minmax.getMinMax(a, b, c); 
        System.out.println("Smallest = " + result[0] + ", Largest = " + result[1]);
    }
}