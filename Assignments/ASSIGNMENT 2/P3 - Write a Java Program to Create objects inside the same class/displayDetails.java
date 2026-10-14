public class Person {
    // Attributes of the Person class
    String name;
    int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects of the Person class inside the same class
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Displaying the details of the created objects
        person1.displayDetails();
        person2.displayDetails();
    }
}
