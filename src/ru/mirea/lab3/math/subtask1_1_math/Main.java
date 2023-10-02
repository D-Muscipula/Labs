package ru.mirea.lab3.math.subtask1_1_math;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(20);
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Math.random();
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n"+n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
