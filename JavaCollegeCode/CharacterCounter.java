import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split the sentence into words
        String[] words = input.trim().split("\\s+");

        // Count characters in each word
        for (String word : words) {
            System.out.println(word + " -> " + word.length() + " characters");
        }

        scanner.close();
    }
}
