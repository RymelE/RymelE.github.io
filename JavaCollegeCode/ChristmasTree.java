
public class ChristmasTree {
    public static void main(String[] args) {
        int height = 5; // number of rows for the tree
        int baseWidth = 5; // number of ^ characters (shorter than tree width)

        // -------------------------------
        // Pretest loop (while loop)
        // -------------------------------
        System.out.println("Christmas Tree using Pretest Loop:");

        int i = 1;
        while (i <= height) {
            // spaces
            for (int s = 1; s <= height - i; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

        // Print ^^^ row (short and centered)
        int spacesBeforeBase = (2 * height - 1 - baseWidth) / 2;
        for (int s = 0; s < spacesBeforeBase; s++) {
            System.out.print(" ");
        }
        for (int x = 1; x <= baseWidth; x++) {
            System.out.print("^");
        }
        System.out.println();

        // Print trunk (centered)
        for (int s = 1; s < height; s++) {
            System.out.print(" ");
        }
        System.out.println("||");
        // Posttest loop (do...while loop)
        System.out.println("\nChristmas Tree using Posttest Loop:");

        int k = 1;
        do {
            // spaces
            for (int s = 1; s <= height - k; s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * k - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            k++;
        } while (k <= height);

        // Print ^^^ row (short and centered)
        spacesBeforeBase = (2 * height - 1 - baseWidth) / 2;
        for (int s = 0; s < spacesBeforeBase; s++) {
            System.out.print(" ");
        }
        for (int x = 1; x <= baseWidth; x++) {
            System.out.print("^");
        }
        System.out.println();

        // Print trunk (centered)
        for (int s = 1; s < height; s++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }
}
