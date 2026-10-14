abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing circle");
    }
}

public class AbstractObjectDemo {

    public static void main(String[] args) {

        // Shape s = new Shape();  // ERROR: cannot create object of abstract class

        Circle c = new Circle();
        c.draw();
    }
}