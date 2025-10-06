import java.util.Scanner;

/**
 * PlayLadder implements the decision table rules using if/else if/else ladder.
 */
public class PlayLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Raining: ");
        boolean isRaining = input.nextBoolean();
        System.out.print("Temperature: ");
        int temperature = input.nextInt();
        boolean belowFreezing = temperature < 32;
        if (isRaining) {
            System.out.println("Play Inside");
        } else if (belowFreezing) {
            System.out.println("Play Inside");
        } else {
            System.out.println("Play Outside");
        }
    }
}
