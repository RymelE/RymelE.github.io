// Write your imports here if needed
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();
    
        //the array
        //its x and y values so the columns is always 2
        double[][] cities = new double[n][2];

        //did it this way to avoid a second j loop
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < n; i++) {
            cities[i][0] = input.nextDouble(); // x-coordinate
            cities[i][1] = input.nextDouble(); // y-coordinate
        }
        // Variables to track central city
        int centralIndex = 0;
        double minTotalDistance = Double.MAX_VALUE;

        // Loop over each city to compute total distance
        for (int i = 0; i < n; i++) {
            double totalDistance = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    totalDistance += distance(cities[i], cities[j]);
                }
            }
            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralIndex = i;
            }
        }

        // Display results
        System.out.println("The central city is at (" 
            + cities[centralIndex][0] + ", " 
            + cities[centralIndex][1] + ")");
        System.out.println("The total distance to all other cities is " + minTotalDistance);

        input.close();
    }

    // Method to calculate distance between two cities
    public static double distance(double[] city1, double[] city2) {
        double dx = city1[0] - city2[0];
        double dy = city1[1] - city2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}