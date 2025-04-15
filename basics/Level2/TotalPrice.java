import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        int unit_price,quantity,total_price;
        System.out.println("Enter the quantity and unit price of the item");
        Scanner input=new Scanner(System.in);
        quantity=input.nextInt();
        unit_price=input.nextInt();
        total_price=(int)quantity*unit_price;

        System.out.println("The total purchase price is INR "+ total_price + " if the quantity " + quantity + " and unit price is INR " + unit_price);
    }
}
