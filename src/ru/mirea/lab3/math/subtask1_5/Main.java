package ru.mirea.lab3.math.subtask1_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        String g;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }
            }
            else{
                g = sc.next();
            }
            System.out.println("Введите число элементов");

        }
        System.out.println(n);
        int[] numbers = new int[n];
        int[] temp = new int[n];
        Random random = new Random();
        int even = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(n);
            System.out.print(numbers[i]+ " ");
            if(numbers[i] % 2 == 0) {
                temp[even] = numbers[i];
                even++;
            }

        }
        int[] res = new int[even];
        System.out.println();
        for (int i = 0; i < even; i++) {
            res[i] = temp[i];
            System.out.print(res[i] + " ");
        }


    }
}
