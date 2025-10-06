
import java.util.Scanner;

/**
 * Reads two integers and prints the average.
 * 
 * There is an error in the code.
 */
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double avg = (num1 + num2) / 2.0;
        System.out.println("Average = " + avg);
    }
}