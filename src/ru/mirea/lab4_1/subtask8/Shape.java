package ru.mirea.lab4_1.subtask8;

// Простейший класс Shape (Фигура)
abstract class Shape {
    protected String color;
    protected boolean filled;
    // Метод для получения типа фигуры

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Shape setColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isFilled() {
        return filled;
    }

    public Shape setFilled(boolean filled) {
        this.filled = filled;
        return this;
    }

    public abstract String getType() ;

    // Методы для получения площади и периметра (
    public abstract double getArea();

    public abstract double getPerimeter();

    // Переопределение метода toString для вывода информации о фигуре
    @Override
    public String toString() {
        return "Тип: " + getType() + "\n" +
                "Площадь: " + getArea() + "\n" +
                "Периметр: " + getPerimeter();
    }
}
