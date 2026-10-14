class Employee {

    void show() {
        System.out.println("This is Employee class");
    }
}

class Manager extends Employee {
    void managerWork() {
        System.out.println("Manager manages team");
    }
}

class Programmer extends Employee {
    void programmerWork() {
        System.out.println("Programmer writes code");
    }
}

class Executive extends Employee {
    void executiveWork() {
        System.out.println("Executive handles operations");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Manager m = new Manager();
        Programmer p = new Programmer();
        Executive e = new Executive();

        m.show();
        m.managerWork();

        p.show();
        p.programmerWork();

        e.show();
        e.executiveWork();
    }
}