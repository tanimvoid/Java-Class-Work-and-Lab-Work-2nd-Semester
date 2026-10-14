class Parent {

    void show() {
        System.out.println("This is Parent method");
    }
}

class Child extends Parent {

    void show() {
        super.show();
        System.out.println("This is Child method");
    }
}

public class SuperMethodCall {

    public static void main(String[] args) {

        Child c = new Child();
        c.show();
    }
}