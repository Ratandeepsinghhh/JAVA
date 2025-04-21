import java.util.*;

class NaturalSum 
{
    
    int getSum(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        NaturalSum ns = new NaturalSum();

        System.out.print("Enter value of N: ");
        int n = in.nextInt();

        System.out.println("Sum = " + ns.getSum(n));
    }
}