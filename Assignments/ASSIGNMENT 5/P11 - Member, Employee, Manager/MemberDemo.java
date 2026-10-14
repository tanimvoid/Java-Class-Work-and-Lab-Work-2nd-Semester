class Member {

    String name;
    int age;
    String phone;
    String address;
    int salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {

    String specialization;
}

class Manager extends Member {

    String department;
}

public class MemberDemo {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Tanim";
        e.age = 21;
        e.phone = "123456789";
        e.address = "Bangladesh";
        e.salary = 40000;
        e.specialization = "Cyber Security";

        System.out.println("Employee Name: " + e.name);
        e.printSalary();

        Manager m = new Manager();

        m.name = "Rahman";
        m.salary = 60000;
        m.department = "IT";

        System.out.println("Manager Name: " + m.name);
        m.printSalary();
    }
}