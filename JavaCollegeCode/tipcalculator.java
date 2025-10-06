import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        double gratuity = 0;
        double subtotal = 0;
        double total = 0;
        double tip = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal: ");
        subtotal = input.nextDouble(); // add parentheses

        System.out.print("Please enter the gratuity rate (in %): ");
        gratuity = input.nextDouble(); // add parentheses

        // Convert percentage to decimal
        gratuity = gratuity / 100;

        tip = subtotal * gratuity;
        total = subtotal + tip;

        System.out.println("Gratuity: $" + tip);
        System.out.println("Total: $" + total);
    }
}