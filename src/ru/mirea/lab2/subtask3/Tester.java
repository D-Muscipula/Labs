package ru.mirea.lab2.subtask3;

public class Tester {
    private static Circle[] circles;
    private static int n;

    public static void main(String[] args) {
        circles = new Circle[]{new Circle(new Point(100.0,100.0), 225),
                new Circle(new Point(225,225), 10),
                new Circle(new Point(10,15), 189)};
        n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(circles[i]);
        }
    }
}
