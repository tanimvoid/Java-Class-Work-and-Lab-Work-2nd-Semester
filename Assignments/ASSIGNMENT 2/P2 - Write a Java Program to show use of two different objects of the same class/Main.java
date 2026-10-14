class MyClass {
    int x;

    void setX(int val) {
        x = val;
    }

    void displayX() {
        System.out.println("x = " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.setX(10);
        obj2.setX(20);

        obj1.displayX(); // Outputs: x = 10
        obj2.displayX(); // Outputs: x = 20
    }
}
