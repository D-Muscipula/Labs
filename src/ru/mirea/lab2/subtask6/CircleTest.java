package ru.mirea.lab2.subtask6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(25.1);
        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(25.1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getSquare());
        System.out.println(circle1.getLength());
        System.out.println(circle1.equals(circle2));
        System.out.println(circle.equals(circle2));
    }
}
