// Write your imports here if needed
import java.util.Scanner;

public class ChapterTwoProjectOne {

    // Write your code here
  public static void main(String[] args){
      double gratuity = 0;
      double subtotal = 0;
      double total = 0;
      double tip = 0;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the subtotal and a gratuity rate:");
      subtotal = input.nextDouble();

      gratuity = input.nextDouble();
     
      gratuity = gratuity / 100;
      tip = subtotal * gratuity;
      total = subtotal + tip;

      System.out.println("The gratuity is $" + tip + " and the total is $" + total);
  }
}