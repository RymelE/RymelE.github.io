import java.util.Scanner;

/**
 * PaintCalculator demonstrates a method that calls another method.
 */
public class PaintCalculator {
	
	private static final int SQ_METER_PER_LITER = 6;
	
	/**
     * wallArea - Returns the area of the four walls given the 
     * length, width, and height of a rectangular room
     * 
     * @param length 
     * @param width  
     * @param height 
     * @return the total area of the four walls
     */
    public static double wallArea(double length, double width, double height) {
    	double perimeter = 2 * (length + width);
    	return perimeter * height;
    }
    
    /**
     * litersPaint - Returns the liters of paint needed to cover the
     * walls of a rectangular room given the length, width, and height in meters.
     * 
     * @param length 
     * @param width  
     * @param height
     * @return the gallons/liters of paint
     */
    public static int litersPaint(double length, double width, double height) {
        double totalSqM = wallArea(length, width, height);
        double liters = Math.round(totalSqM / SQ_METER_PER_LITER) ;
        return (int) liters;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length, width, height(m): ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		//Testing wallArea
		//double wallSqM = wallArea(length, width, height);
		//System.out.println("Wall area: " + wallSqM);	
		
		//Testing litersPaint
		int liters = litersPaint(length, width, height);
		System.out.println("Buy " + liters + " liters.");
		
		input.close();
	}

}
