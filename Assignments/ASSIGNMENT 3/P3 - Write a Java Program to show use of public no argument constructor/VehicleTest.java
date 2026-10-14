// Define a class named 'Vehicle'
class Vehicle {
    // Fields (attributes) of the class
    String make;
    String model;

    // Public no-argument constructor
    public Vehicle() {
        // Initialize fields with default values
        make = "Unknown";
        model = "Unknown";
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

// Define another class to test the Vehicle class
public class VehicleTest {
    public static void main(String[] args) {
        // Create an object of Vehicle using the public no-argument constructor
        Vehicle myVehicle = new Vehicle();

        // Display information of the vehicle
        myVehicle.displayInfo();
    }
}
