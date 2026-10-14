class Person {

    Person(String name) {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {

    Student() {
        super("Tanim");
        System.out.println("Student Constructor Called");
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

        Student s = new Student();
    }
}