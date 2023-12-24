package ru.mirea.lab4_1.subtask1;

// Дочерний класс Square (Квадрат)
class Square extends Rectangle {
    // Конструктор класса Square
    public Square(double side) {
        super(side, side); // Квадрат - это прямоугольник с равными сторонами
    }

    // Переопределение метода getType для возврата типа "Квадрат"
    @Override
    public String getType() {
        return "Квадрат";
    }
}
