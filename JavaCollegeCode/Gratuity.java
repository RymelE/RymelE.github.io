import java.util.Scanner;

/**
 * Gratuity reads a tip rate and number of customers.
 * A minimum tip of 20% is required for large parties (>= 8 customers)
 * 
 * There is an error in the code.
 */

public class Gratuity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("%tip and #customers: ");
        int tip = input.nextInt();
        int customers = input.nextInt();
        if (tip < 20 && customers >= 8) {
            tip = 20;
        }
        System.out.println("%Tip: " + tip);
    }
}
