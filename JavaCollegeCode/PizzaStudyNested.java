import java.util.Scanner;

/**
 * PizzaStudyNested implements the decision table rules with nesting.
 */
public class PizzaStudyNested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cash: ");
        double cash = input.nextDouble();
        System.out.print("Hungry: ");
        boolean isHungry = input.nextBoolean();
        if (cash >= 20) {
            if (isHungry) {
                System.out.println("Order Pizza");
            } else {
                System.out.println("Study");
            }
        } else {
            System.out.println("Study");
        }
    }
}
