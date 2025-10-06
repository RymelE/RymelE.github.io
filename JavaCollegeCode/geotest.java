// Write your imports here if needed
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){ 
        double point1;
        double point2;
        int x = 0;
        int y = 0;
        String message = " ";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        point1 = input.nextDouble();
        point2 = input.nextDouble();

        x = Math.abs(point1) <= 5 ? 1 : 2;
        y = Math.abs(point2) <= 2.5 ? 1 : 2;

        message = (x == 1 && y == 1) ? "is in the rectangle" : "is not in the rectangle";

        System.out.println("Point (" + point1 + ", " + point2 + ") " + message);

    
    // Write your code here
    }
}