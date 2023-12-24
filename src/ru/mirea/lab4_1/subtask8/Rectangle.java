package ru.mirea.lab4_1.subtask8;

// Дочерний класс Rectangle (Прямоугольник)
class Rectangle extends Shape {
    protected double width;
    protected double length;

    // Конструктор класса Rectangle
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {

    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Rectangle setLength(double length) {
        this.length = length;
        return this;
    }

    // Переопределение метода getType для возврата типа "Прямоугольник"
    @Override
    public String getType() {
        return "Прямоугольник";
    }

    // Переопределение метода getArea для вычисления площади прямоугольника
    @Override
    public double getArea() {
        return width * length;
    }

    // Переопределение метода getPerimeter для вычисления периметра прямоугольника
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
