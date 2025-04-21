import java.util.Scanner; 

class SpringSeasonChecker 
{
    
    boolean isSpring(int month, int day) 
    {

        return (month == 3 && day >= 20) || 
               (month == 4 || month == 5) || 
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        SpringSeasonChecker ssc = new SpringSeasonChecker();

        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();

        System.out.print("Enter day: ");
        int day = in.nextInt();

        if (ssc.isSpring(month, day)) 
        {
            System.out.println("It's Spring season.");
        } 
        else 
        {
            System.out.println("It's NOT Spring season.");
        }

        in.close();
    }
}
