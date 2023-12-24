package ru.mirea.lab4_1.subtask7;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new SchoolStudent("Иван", 15, 9);
        students[1] = new SchoolStudent("Мария", 14, 8);
        students[2] = new Student("Петр", 20, "Университет А");
        students[3] = new Student("Елена", 22, "Университет Б");

        System.out.println("Школьники:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                student.showInfo();
                System.out.println();
            }
        }

        System.out.println("Студенты:");
        for (Student student : students) {
            if (!(student instanceof SchoolStudent)) {
                student.showInfo();
                System.out.println();
            }
        }
    }
}
