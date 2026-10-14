abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    abstract void run();

    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Bike extends Vehicle {

    void run() {
        System.out.println("Bike is running");
    }
}

public class AbstractConstructorDemo {

    public static void main(String[] args) {

        Bike b = new Bike();

        b.run();
        b.fuel();
    }
}