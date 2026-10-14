class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.sound();
    }
}