// Define a class named 'Student'
class Student {
    // Fields (attributes) of the class
    String name;
    int age;

    // The default constructor is automatically provided by Java
    // if no other constructors are defined.

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Define another class to test the Student class
public class StudentTest {
    public static void main(String[] args) {
        // Create an object of Student using the default constructor
        Student student = new Student();

        // Display information of the student
        student.displayInfo();
    }
}
