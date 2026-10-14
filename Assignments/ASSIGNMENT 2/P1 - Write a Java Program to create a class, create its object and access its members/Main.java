class MyClass {
    // Member variable
    int x;

    // Member function
    void setX(int val) {
        x = val;
    }

    void displayX() {
        System.out.println("x = " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();

        // Access member functions
        obj.setX(10);
        obj.displayX();
    }
}
