class Parent {

    final void show() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {

    // void show() { }   // ERROR: cannot override final method
}

public class FinalMethodDemo {

    public static void main(String[] args) {

        Child c = new Child();
        c.show();
    }
}