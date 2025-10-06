
class Rectangle {
    private double width;
    private double height;

    // No-arg constructor
    public Rectangle() {
        this.width = 1;
        this.height = 2;
    }

    // Parameterized constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Area
    public double getArea() {
        return width * height;
    }

    // Perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
public class Exercise {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Display details
        System.out.println("The area of a rectangle with width " + r1.getWidth() +
                           " height " + r1.getHeight() +
                           " is " + r1.getArea() +
                           ", perimeter = " + r1.getPerimeter());

        System.out.println("Rectangle 2: width = " + r2.getWidth() +
                           ", height = " + r2.getHeight() +
                           ", area = " + r2.getArea() +
                           ", perimeter = " + r2.getPerimeter());
    }
}
