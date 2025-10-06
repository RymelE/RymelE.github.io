import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        // Prompt for array elements
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // Locate largest element
        int[] location = locateLargest(array);

        // Display result
        System.out.println("The location of the largest element is at (" 
                           + location[0] + ", " + location[1] + ")");

        input.close();
    }

    // Method to find the largest element in a 2D array
    public static int[] locateLargest(double[][] a) {
        double largest = a[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    row = i;
                    col = j;
                }
                // If same largest value, keep the smallest row/column
                else if (a[i][j] == largest) {
                    if (i < row || (i == row && j < col)) {
                        row = i;
                        col = j;
                    }
                }
            }
        }

        return new int[]{row, col};
    }
}
