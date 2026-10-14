class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car drives");
    }
}

class SportsCar extends Car {

    void speed() {
        System.out.println("Sports car runs very fast");
    }
}

public class VehicleInheritance {

    public static void main(String[] args) {

        SportsCar s = new SportsCar();

        s.start();
        s.drive();
        s.speed();
    }
}