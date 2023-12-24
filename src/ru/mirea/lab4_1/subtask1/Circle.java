package ru.mirea.lab4_1.subtask1;

// Дочерний класс Circle (Круг)
class Circle extends Shape {
    private double radius;

    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода getType для возврата типа "Круг"
    @Override
    public String getType() {
        return "Круг";
    }

    // Переопределение метода getArea для вычисления площади круга
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода getPerimeter для вычисления периметра круга
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
