import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age of voter");
        Scanner input=new Scanner(System.in);
        age= input.nextInt();
        if(age>=18){
            System.out.println("The person's age is "+ age +" and can vote");
        }
        else{
            System.out.println("The person's age is "+ age +" and cannot vote");
        }
    }
}
