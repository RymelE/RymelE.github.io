import java.util.Scanner;

/**
 * EmployeeSales uses a 2D array to store daily sales per employee.
 * Each row stores the sales for one employee. There is an error in the code.
 */
public class EmployeeSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter #employees and #days: ");
        int numEmployees = input.nextInt();
        int numDays = input.nextInt();
        double[][] sales = new double[numEmployees][numDays];
        //sales.length is the number of rows
        for (int row = 0; row < sales.length; row++) {
        	//sales[row].length is the number of columns in the row
        	System.out.print("Enter " + sales[row].length + " sales for employee#" + (row+1) +": " );
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = input.nextDouble();
            }
        }
        
        //Average daily sales per employee
        
        for (int row = 0; row < sales.length; row++) {
        	double sum = 0;
        	for (int col = 0; col < sales[row].length; col++) {
                sum += sales[row][col];
        	}
        	System.out.println("Employee#" + (row+1) + " average: " + sum/sales[row].length);
        }

    }
}
