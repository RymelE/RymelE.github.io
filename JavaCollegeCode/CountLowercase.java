import java.util.Scanner;

/**
 * CountLowercase  reads in a string and prints the number of lowercase letters.
 * 
 * There is an error in the code
 */
public class CountLowercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = input.nextLine();
		
		int lowercase=0;
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i); 
			if (c >= 'a' && c <= 'z')
				lowercase++;
		}
		System.out.println(lowercase);
		
	}
}
