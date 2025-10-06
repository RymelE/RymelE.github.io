
import java.util.Scanner;

public class Excersice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        double total = 0;
        int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true) {
            float num = (float) input.nextDouble();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positives = positives + 1;
            } else {
                negatives = negatives + 1;
            }

            total += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The total is " + String.format("%.2f", total));
            System.out.println("The average is " + String.format("%.2f", (total / count)));
        }
    }
}