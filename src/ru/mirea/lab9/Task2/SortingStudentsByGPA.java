package ru.mirea.lab9.Task2;

import ru.mirea.lab9.Task1.Student;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return  (o2.getScore() - o1.getScore());
    }
    public static void sort(List<Student> students) {
        QuickSort.quickSort(students, new SortingStudentsByGPA());
    }
}
