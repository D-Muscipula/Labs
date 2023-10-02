package ru.mirea.lab3.format.subtask1_3;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public Employee setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public static void main(String[] args) {
        Employee[] employees = {new Employee("Y.L.",123.345),
                new Employee("Qw. Er.",189.32),new Employee("T.Y.",110.12312)};
        Report.generateReport(employees);
    }
}
