


import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN number as a string: ");
        String isbn = input.nextLine();

        // Validate input length and digits
        if (isbn.length() != 12 || !isbn.matches("\\d{12}")) {
            System.out.println(isbn + " is an invalid input");
            return;
        }

        int sum = 0;

        // Compute weighted sum
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0'; // convert char to int
            if (i % 2 == 0) {
                sum += digit;     // odd position → weight 1
            } else {
                sum += digit * 3; // even position → weight 3
            }
        }

        // Calculate checksum
        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        // Final ISBN-13
        System.out.println("The ISBN-13 number is " + isbn + checksum);
    }
}