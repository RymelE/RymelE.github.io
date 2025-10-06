import java.util.Scanner;

/**
 * PizzaStudyAnd implements the decision table rules using logical AND &&.
 */
public class PizzaStudyAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cash: ");
        double cash = input.nextDouble();
        System.out.print("Hungry: ");
        boolean isHungry = input.nextBoolean();
        if (cash >= 20 && isHungry) {
            System.out.println("Order Pizza");
        } else {
            System.out.println("Study");
        }
    }
}
