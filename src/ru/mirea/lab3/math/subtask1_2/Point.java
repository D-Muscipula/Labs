package ru.mirea.lab3.math.subtask1_2;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Point setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Point setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
