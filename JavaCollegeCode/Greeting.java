
/**
 * Prompts for name and outputs a greeting until "quit" is entered.
 * 
 * There is an infinite loop error.
 */
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Name (or quit): ");
        String name = input.next();
        int count = 0;
        while (!name.equals("quit")) {
        	if (count % 2 == 0)
        		System.out.println("Hello " + name);
        	else
        		System.out.println("Welcome " + name);
        	System.out.print("Name (or quit): ");
            name = input.next();
            count++;
        }

        System.out.println("Goodbye");
    }
}