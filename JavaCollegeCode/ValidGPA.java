import java.util.Scanner;

/**
 * ValidGPA reads in a double and prints whether it is a valid GPA in the range
 * 0.0 to 4.0 (inclusive).
 * 
 * There is an error in the code.
 */

public class ValidGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("GPA: ");
        double gpa = input.nextDouble();

        if (gpa <= 4.0) {
            System.out.println(gpa + " is valid");
        } else {
            System.out.println(gpa + " is invalid");
        }
    }
}
