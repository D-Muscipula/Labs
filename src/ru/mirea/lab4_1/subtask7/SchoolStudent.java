package ru.mirea.lab4_1.subtask7;

class SchoolStudent extends Student {
    private int grade;

    public SchoolStudent(String name, int age, int grade) {
        super(name, age, "Школа");
        this.grade = grade;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Класс: " + grade);
    }
}
