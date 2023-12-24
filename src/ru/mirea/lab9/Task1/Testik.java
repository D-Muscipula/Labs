package ru.mirea.lab9.Task1;

import java.util.ArrayList;
import java.util.List;

public class Testik {
    public static void insertionSort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getiDNumber() > key.getiDNumber()) {
                students.set(j + 1, students.get(j));
                j--;
            }
            students.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karl", 1233, 99));
        students.add(new Student("Friedrich", 7829, 5));
        students.add(new Student("Vladimir", 98130, 1917));
        students.add(new Student("Lev", 187, 1905));
        students.add(new Student("Michael", 5040, 74));
        students.add(new Student("Vasya", 678, 105));

        insertionSort(students);

        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }
}
