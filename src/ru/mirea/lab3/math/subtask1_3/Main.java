package ru.mirea.lab3.math.subtask1_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int k = 0; k < 15; k++) {


        int[] numbers = {random.nextInt(89)+10,
                random.nextInt(89)+10,
                random.nextInt(89)+10,
                random.nextInt(89)+10};
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + " ");
        }
        int vozr = 0;
        for (int i = 0; i < 3; i++) {
            if(numbers[i] < numbers[i+1]){
                vozr++;
            } else if (numbers[i] > numbers[i+1]) {
                vozr--;
            }
        }
        if(vozr == 3) System.out.println("Строго возрастает");
        else System.out.println("Не является строго возрастающей последовательностью");
    }}
}
