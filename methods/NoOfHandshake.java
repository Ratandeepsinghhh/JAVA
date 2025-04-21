import java.util.Scanner;

public class NoOfHandshake 
{
    public static int combinations(int n ){
        int combinations= (n * (n - 1)) / 2;
        return combinations;
    }
    public static void main(String[] args)
    {
            
        Scanner input = new Scanner(System.in);
        
        System.err.println("Enetr no of handshakes : ");
        int n= input.nextInt();
        
        int handshakes=combinations(n);
        System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
    }
}
