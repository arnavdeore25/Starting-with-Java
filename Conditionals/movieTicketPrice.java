import java.util.*;

class movieDetails
{
    int basePrice = 250;
    float discountAmount = 0;
    float finalPrice;
    public void priceCalculator(int age, String day)
    {
        if (!day.equalsIgnoreCase("Sunday") && !day.equalsIgnoreCase("Saturday"))
        {
            discountAmount = basePrice * (10f / 100);
        }
        if (discountAmount == 0) 
        {
            if (age < 12) {
                discountAmount = basePrice * (50f / 100);
                
            }
            else if(age >= 60) {
                discountAmount = basePrice * (30f / 100);
            }
            finalPrice = basePrice - discountAmount;
        }
    }
    public void displayDetails()
    {
        System.out.printf("%-20s %-20s %-20s", "Orignal Price", "Discount Price", "Final Price");
        System.out.println("\n");
        System.out.printf("%-20s %-20s %-20s", basePrice, discountAmount, finalPrice);
    }

}

public class movieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        movieDetails m1 = new movieDetails();
        int age;
        String day;
        // float basePrice = 200;

        System.out.println("Enter you age: ");
        age = sc.nextInt();
        System.out.println("Enter day: ");
        day = sc.next();
        m1.priceCalculator(age, day);
        m1.displayDetails();
        sc.close();
    
    }
}
