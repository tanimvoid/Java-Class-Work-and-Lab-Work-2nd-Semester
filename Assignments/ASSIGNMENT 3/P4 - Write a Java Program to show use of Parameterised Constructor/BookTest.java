// Define a class named 'Book'
class Book {
    // Fields (attributes) of the class
    String title;
    String author;
    double price;

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

// Define another class to test the Book class
public class BookTest {
    public static void main(String[] args) {
        // Create an object of Book using the parameterized constructor
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        // Display information of the book
        myBook.displayInfo();
    }
}
