package ru.mirea.lab4_1.subtask1;

// Дочерний класс Rectangle (Прямоугольник)
class Rectangle extends Shape {
    private double width;
    private double height;

    // Конструктор класса Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Переопределение метода getType для возврата типа "Прямоугольник"
    @Override
    public String getType() {
        return "Прямоугольник";
    }

    // Переопределение метода getArea для вычисления площади прямоугольника
    @Override
    public double getArea() {
        return width * height;
    }

    // Переопределение метода getPerimeter для вычисления периметра прямоугольника
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
