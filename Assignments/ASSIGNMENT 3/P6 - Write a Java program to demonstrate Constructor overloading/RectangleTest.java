// Define a class named 'Rectangle'
class Rectangle {
    // Fields (attributes) of the class
    double length;
    double width;

    // Default constructor
    public Rectangle() {
        length = 1.0; // Default length
        width = 1.0;  // Default width
    }

    // Parameterized constructor with two arguments
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Parameterized constructor with one argument (square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to display rectangle information
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

// Define another class to test the Rectangle class
public class RectangleTest {
    public static void main(String[] args) {
        // Create objects of Rectangle using different constructors
        Rectangle rect1 = new Rectangle();              // Default constructor
        Rectangle rect2 = new Rectangle(5.0, 3.0);     // Parameterized constructor with two arguments
        Rectangle rect3 = new Rectangle(4.0);          // Parameterized constructor with one argument (square)

        // Display information of each rectangle
        System.out.println("Rectangle 1:");
        rect1.displayInfo();

        System.out.println("\nRectangle 2:");
        rect2.displayInfo();

        System.out.println("\nRectangle 3:");
        rect3.displayInfo();
    }
}
