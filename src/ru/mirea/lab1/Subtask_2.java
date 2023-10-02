package ru.mirea.lab1;

import java.util.Scanner;

public class Subtask_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] array = new int[n];
        int sum = 0;
        int count = 0;
        while(count < n){
            array[count] = sc.nextInt();
            count++;
        }
        count = 0;
        int max = array[0];
        int min = array[0];
        do {
            sum += array[count];
            if(array[count] > max) max = array[count];
            if(array[count] < min) min = array[count];
            count++;
        }
        while(count < n);
        System.out.println("Сумма: "+sum+" Максимальное: "+max +" Минимальное: "+min);
    }
}
