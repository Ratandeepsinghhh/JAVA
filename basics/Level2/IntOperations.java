import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args) {
            int a,b,c,op1,op2,op3,op4;

            Scanner input=new Scanner(System.in);
            System.out.println("Enter 3 numbers");
            a=input.nextInt();
            b=input.nextInt();
            c=input.nextInt();
            op1= a + b *c;
            op2= a * b + c;
            op3= c + a / b;
            op4= a % b + c;
            System.out.println("The results of Int Operations are " + op1 + " "+op2+" "+op3+" and "+op4);
    }
}
