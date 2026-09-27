package Inheritance;

class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {

    String department;
    int teamSize;

    Manager(String name, int employeeId, double salary, String department, int teamSize) {

        super(name, employeeId, salary);

        this.department = department;
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}


public class EmployeeManager {
    public static void main(String[] args) {

        Manager manager = new Manager("Arnav", 101, 75000, "Technology", 8);
        manager.displayManagerDetails();
    }
}