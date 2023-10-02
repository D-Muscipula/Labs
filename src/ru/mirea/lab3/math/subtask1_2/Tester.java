package ru.mirea.lab3.math.subtask1_2;

import ru.mirea.lab2.subtask3.Circle;
import ru.mirea.lab2.subtask3.Point;

import java.util.Random;

public class Tester {
    private static Circle[] circles;
    private static int n;

    public static void main(String[] args) {
        Random random = new Random();
        n = random.nextInt(10);
        circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            circles[i] = new Circle(new Point(Math.random(),
                    Math.random()), random.nextInt(100));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(circles[i]);
        }
        System.out.println("Наибольшая: " + maxi());
        System.out.println("Наименьшая: " + mini());
        sorti();
        for (int i = 0; i < n; i++) {
            System.out.println(circles[i]);
        }
    }

    private static Circle mini(){
        Circle res = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(circles[i].getRadius() < min){
                min = circles[i].getRadius();
                res = circles[i];
            }

        }
        return res;
    }
    private static Circle maxi(){
        Circle res = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(circles[i].getRadius() > max){
                max = circles[i].getRadius();
                res = circles[i];
            }

        }
        return res;
    }
    private static void sorti(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(circles[j].getRadius() > circles[j+1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }
}
