import java.util.Scanner;

public class ChapterTwoProjectTwo {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // Convert annual interest rate percentage to decimal
        double rate = annualRate / 100;

        // Compute future investment value (compound interest, compounded monthly)
        double futureValue = amount * Math.pow(1 + rate / 12, years * 12);

        // Display result with 2 decimal places
        System.out.printf("Accumulated value is: $%.2f\n", futureValue);
    }
}