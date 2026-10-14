// Define a class named 'Singleton'
class Singleton {
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private no-argument constructor
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Static method to get the single instance of the class
    public static Singleton getInstance() {
        // Create the instance if it does not exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Method to display information
    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Define another class to test the Singleton class
public class SingletonTest {
    public static void main(String[] args) {
        // Attempt to create multiple instances of the Singleton class
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both instances equal? " + (s1 == s2));

        // Call a method on the Singleton instance
        s1.displayMessage();
    }
}
