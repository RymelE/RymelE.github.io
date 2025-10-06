import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of rows and columns
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        // Prompt the user to enter the array elements
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // Locate the largest element
        Location largest = locateLargest(array);

        // Display the result
        System.out.println("The largest element is " + largest.maxValue + 
                           ", located at (" + largest.row + "," + largest.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
                // If there is a tie, choose the smallest row, then column
                else if (a[i][j] == location.maxValue) {
                    if (i < location.row || (i == location.row && j < location.column)) {
                        location.row = i;
                        location.column = j;
                    }
                }
            }
        }

        return location;
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;
}
