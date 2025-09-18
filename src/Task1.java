import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double price = 0;
        double shipping = 0;
        double total;
        int FREE_SHIPPING = 100;
        double SHIPPING_PERCENT = .02;

        System.out.println("What is the price of your item?");
        if (scan.hasNextDouble()) {
            price = scan.nextDouble();

            if (price < FREE_SHIPPING) {
                shipping = price  * SHIPPING_PERCENT;
            } else {
                shipping = 0;
            }

        } else {
            System.out.println("Invalid number, please try again.");
            System.exit(0);
        }

        total = shipping + price;
        System.out.println("Your shipping price is $" + shipping + " and your total will be " + total);
    }
}
