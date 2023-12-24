package ru.mirea.lab4_1.subtask1;

// Простейший класс Shape (Фигура)
class Shape {
    // Метод для получения типа фигуры
    public String getType() {
        return "Фигура";
    }

    // Методы для получения площади и периметра (
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    // Переопределение метода toString для вывода информации о фигуре
    @Override
    public String toString() {
        return "Тип: " + getType() + "\n" +
                "Площадь: " + getArea() + "\n" +
                "Периметр: " + getPerimeter();
    }
}
