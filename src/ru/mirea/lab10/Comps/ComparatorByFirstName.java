package ru.mirea.lab10.Comps;

import ru.mirea.lab10.Student;

import java.util.Comparator;

public class ComparatorByFirstName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
