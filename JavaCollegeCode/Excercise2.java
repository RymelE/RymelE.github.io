import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine().trim();
        boolean valid = true;
        if (ssn.length() != 11) {
            valid = false;
        }
        else {
            
            for (int i = 0; i < ssn.length(); i++) {
                char c = ssn.charAt(i);

                if (i == 3 || i == 6) {  
                    // Position 3 and 6 must be '-'
                    if (c != '-') {
                        valid = false;
                        break;
                    }
                } else {
                    if (!Character.isDigit(c)) {
                        valid = false;
                        break;
                    }
                }
            }
        }
        if (valid) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}

