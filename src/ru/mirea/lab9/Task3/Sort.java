package ru.mirea.lab9.Task3;

import ru.mirea.lab9.Task1.Student;

import java.util.Comparator;

public class Sort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getiDNumber() - o2.getiDNumber());
    }
}
