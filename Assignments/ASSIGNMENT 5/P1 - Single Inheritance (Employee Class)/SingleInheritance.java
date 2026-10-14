class Employee {

    String name = "Tanim";
    int salary = 50000;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    void showRole() {
        System.out.println("Role: Manager");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.display();
        m.showRole();
    }
}