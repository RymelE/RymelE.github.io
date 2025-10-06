import java.util.Scanner;

/*
 * DailyTemperature uses one loop to read in 7 temperatures and stores them in an array.
 * Another loop iterates over the array to count the number of 
 * temperatures below, equal to, and above the average.
 * 
 * There is an error in the code.
 */
public class DailyTemperature{
	
	public static final int DAYS_IN_WEEK = 7;
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temperatures = new int[DAYS_IN_WEEK]; 
        int sum = 0;
        
        // Read temperatures into array and maintain sum
        System.out.print("Enter " + DAYS_IN_WEEK + " temperatures: ");
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = input.nextInt();
            sum += temperatures[i];
        }
        
        // Compute average temperature
        double avg = 1.0 * sum / temperatures.length;
        System.out.printf("Average: %.2f\n" , avg);
        
        // Count number of days below, equal to, and above average
        int belowAvg = 0;
        int equalAvg = 0;
        int aboveAvg = 0;
       
        for (int temperature : temperatures) {
        	if (temperature == avg)
        		equalAvg++;
        	else if (temperature > avg)
            	aboveAvg++;
            else 
            	belowAvg++;
        }
        System.out.printf("Below:%d Equal:%d Above:%d\n", belowAvg, equalAvg, aboveAvg);
        
    }
}
