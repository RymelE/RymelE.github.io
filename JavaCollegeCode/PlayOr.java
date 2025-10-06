import java.util.Scanner;

/**
 * PlayOr implements the decision table rules using logical OR ||.
 */
public class PlayOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Raining: ");
        boolean isRaining = input.nextBoolean();
        System.out.print("Temperature: ");
        int temperature = input.nextInt();
        boolean belowFreezing = temperature < 32;
        if (isRaining || belowFreezing) {
            System.out.println("Play Inside");
        } else {
            System.out.println("Play Outside");
        }
    }
}
