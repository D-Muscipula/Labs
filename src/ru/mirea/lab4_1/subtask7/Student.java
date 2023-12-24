package ru.mirea.lab4_1.subtask7;

public class Student {
    private String name;
    private int age;
    private String university;

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Университет: " + university);
    }
}
