
/**
 * AverageAge class reads in a person count and loops to read in that many ages.  
 * Output the average age if 1+ ages are entered.
 * 
 * There is an error in the code
 */
import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        
        System.out.print("#people: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("age: ");
            int age = input.nextInt();
            sum += age;
        }

        if (n > 0)
        	System.out.println("average: " + sum / n);
        else
        	System.out.println("#people should exceed 0");
       
    }
}