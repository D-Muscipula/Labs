package ru.mirea.lab4_1.subtask8;

// Дочерний класс Square (Квадрат)
class Square extends Rectangle {
    // Конструктор класса Square
    public Square(double side) {
        super(side, side); // Квадрат - это прямоугольник с равными сторонами
    }

    public Square() {

    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    // Переопределение метода getType для возврата типа "Квадрат"

    @Override
    public Rectangle setWidth(double width) {
        return super.setWidth(width);
    }

    @Override
    public Rectangle setLength(double length) {
        return super.setLength(length);
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
