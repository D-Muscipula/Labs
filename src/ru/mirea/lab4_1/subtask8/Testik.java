package ru.mirea.lab4_1.subtask8;

public class Testik {
    public static void main(String[] args) {
        // Создаем фигуры с новыми данными
        Shape circle = new Circle(7.0); // Круг с радиусом 7.0
        Shape rectangle = new Rectangle(5.0, 10.0); // Прямоугольник со сторонами 5.0 и 10.0
        Shape square = new Square(4.0); // Квадрат со стороной 4.0

        // Выводим информацию о фигурах
        System.out.println("Информация о фигуре: " + circle.getType());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println();

        System.out.println("Информация о фигуре: " + rectangle.getType());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println("Информация о фигуре: " + square.getType());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
    }
}
