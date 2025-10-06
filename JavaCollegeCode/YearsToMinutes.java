import java.util.Scanner;

/**
 * YearsToMinutes reads the number of years from user input and prints the
 * equivalent number of minutes.
 * 
 * An overflow error occurs when the number of years is large.
 */
public class YearsToMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter years: ");
        int years = input.nextInt();    //Do not change this line
        long minutes = years * 365L * 24 * 60;   //Fix this line
        System.out.println(minutes + " minutes");
    }
}
