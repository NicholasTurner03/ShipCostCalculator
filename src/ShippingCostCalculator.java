import java.util.Scanner;

public class ShippingCostCalculator {

    public static void main(String[] args) {
        int itemPrice;
        double shippingCost;
        double totalCost;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your item price:");
        itemPrice = in.nextInt();

        if (itemPrice >= 100)
        {
            System.out.println("Your shipping cost is 0!");
            System.out.println("Your total cost is $"+itemPrice);
        }
        else
        {
            shippingCost=itemPrice*.02;
            totalCost=itemPrice+shippingCost;
            System.out.println("Your shipping cost is $"+shippingCost);
            System.out.println("Your total cost is $"+totalCost);
        }

    }
}
