import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        double  Principal , Rate, Time,simpleintrest;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Principal Rate and Time ");
        Principal=input.nextDouble();
        Rate=input.nextDouble();
        Time=input.nextDouble();
        simpleintrest=Principal * Rate * Time / 100;
        System.out.println("The Simple Interest is "+simpleintrest+"  for Principal "+Principal+" Rate of Interest "+Rate+" and Time "+Time);

    }
}
