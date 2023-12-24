package ru.mirea.lab4_1.subtask6;

public class Test {
    public static void main(String[] args) {
        Employer[] employees = new Employer[2];
        employees[0] = new Employer("Иван", "Петров", 50000);
        employees[1] = new Manager("Анна", "Сидорова", 60000, 5000);

        for (Employer employee : employees) {
            System.out.println("Доход " + employee.getClass().getSimpleName() + ": " + employee.getIncome());
        }
    }
}
