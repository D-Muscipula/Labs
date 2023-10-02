package ru.mirea.lab1;

import java.util.Scanner;

public class Subtask_1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма "+ sum + " Среднее арифметическое " + (double)sum/n);
    }
}
