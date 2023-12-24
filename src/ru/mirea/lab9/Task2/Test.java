package ru.mirea.lab9.Task2;

import ru.mirea.lab9.Task1.Student;

import java.util.ArrayList;
import java.util.List;

import static ru.mirea.lab9.Task2.SortingStudentsByGPA.sort;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karl", 1233, 99));
        students.add(new Student("Friedrich", 7829, 5));
        students.add(new Student("Vladimir", 98130, 1917));
        students.add(new Student("Lev", 187, 1905));
        students.add(new Student("Michael", 5040, 74));
        students.add(new Student("Vasya", 678, 105));

        sort(students);

        for (Student student : students) System.out.println(student);
    }
}
