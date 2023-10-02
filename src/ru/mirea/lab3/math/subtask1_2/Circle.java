package ru.mirea.lab3.math.subtask1_2;

public class Circle {
    private Point center;
    private int radius;
    public Point getCenter() {
        return center;
    }

    public Circle setCenter(Point center) {
        this.center = center;
        return this;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
