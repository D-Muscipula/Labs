package ru.mirea.lab2.subtask2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(50, 25);
        System.out.println(b1);
        b1.setXY(123,1231);
        System.out.println(b1);
        b1.setY(12312);
        System.out.println(b1);
        b1.setX(1231);
        System.out.println(b1);
    }

}
