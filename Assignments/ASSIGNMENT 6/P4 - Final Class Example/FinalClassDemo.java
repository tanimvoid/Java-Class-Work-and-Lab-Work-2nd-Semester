final class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

// class Bike extends Vehicle {}  // ERROR: cannot inherit final class

public class FinalClassDemo {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.run();
    }
}