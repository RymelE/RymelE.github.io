import java.util.Scanner;

/**
 * Computes 3 iterations of transmission for a particular R0.
 * 
 * There is an error in the code.
 */
public class TransmissionRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter R0: ");
        double r0 = input.nextDouble();
        int iterations = 3;
        double infected = Math.pow(r0, iterations);
        System.out.println(iterations + " iterations result in " + infected + " infections");
    }
}