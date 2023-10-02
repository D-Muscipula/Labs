package ru.mirea.lab3.format.subtask1_3;

import java.util.Formatter;

public class Report {
    public static void generateReport(Employee[] employees){

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Работник: %s %120s Зарплата: %.2f \n", employees[i].getFullname()," ",employees[i].getSalary());
        }
    }
}
