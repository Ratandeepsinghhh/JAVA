import java.util.Scanner;

public class checknumber {
    public static int CheckNumber (int number){
        if (number<0){
            return -1;
        }
        else if (number>0){
            return 1;
        }
        else{
           
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.println("Enter the number ");
        int number=input.nextInt();
        int check=CheckNumber(number);
        System.err.print("The number entered is : "+check);
    }
}
