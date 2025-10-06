// Write your imports here if needed
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sides = 0;
        float length = 0;
        double area = 0;

        System.out.println("Enter the number of sides: ");
        sides = input.nextInt();
        System.out.print("Enter the length of a side: ");
        length = input.nextFloat();

        area = ((sides * Math.pow(length, 2)) / ( 4 * Math.tan(Math.PI / sides)));

        System.out.println("The area of the polygon is " + area);

    }
}