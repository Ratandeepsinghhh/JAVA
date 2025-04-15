import java.util.Scanner;
public class DoubleOperations {
    public static void main(String[] args) {
        double a,b,c,op1,op2,op3,op4;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        op1= (double)a + b *c;
        op2= (double)a * b + c;
        op3= (double)c + a / b;
        op4= (double)a % b + c;
        System.out.println("The results of Int Operations are " + op1 + " "+op2+" "+op3+" and "+op4);
    }
}