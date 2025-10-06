import java.util.Scanner;

/**
 * PizzaPrice reads in a pizza size (1=small, 2=medium, 3=large) along with the
 * number of reward points. The price (small=8.25, medium=12.25, large=16.25)
 * is discounted $1.00 if the customer has at least 100 points.
 * 
 * There is an error in the code.
 */

public class PizzaPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pizza Size 1=small,2=medium,3=large: ");
        int size = input.nextInt();
        System.out.print("Reward Points: ");
        int points = input.nextInt();

        double price = 0;
        switch (size) {
            case 1: // small
                price = 8.25;
                break;
            case 2: // medium
                price = 12.25;
                break;
            case 3: // large
                price = 16.25;
                break;
        }

        // $1.00 discount for medium or large pizza if customer has at least 100 points.
        if (points >= 100 && size == 2 || size == 3) {
            price -= 1.00;
        }
        System.out.println("Price: $" + price);

    }
}
