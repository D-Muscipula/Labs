package ru.mirea.lab10.Comps;

import ru.mirea.lab10.Student;

import java.util.Comparator;

public class ComparatorBySpeciality implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSpecialty().compareTo(s2.getSpecialty());
    }
}