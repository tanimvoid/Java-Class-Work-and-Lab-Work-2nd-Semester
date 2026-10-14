// Define a class named 'Person'
class Person {
    // Fields (attributes) of the class
    String name;
    int age;

    // Default constructor (no arguments)
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor (with arguments)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to test the Person class
public class Main {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Person person1 = new Person();
        person1.displayInfo();

        System.out.println(); // Print a blank line for separation

        // Create an object using the parameterized constructor
        Person person2 = new Person("Alice", 30);
        person2.displayInfo();
    }
}
