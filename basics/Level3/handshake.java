import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        int N,handshake;
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        handshake=(N * (N - 1)) / 2;
        System.out.println("Possible number of handshakes are "+handshake);

    }
}
