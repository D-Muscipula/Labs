package ru.mirea.lab2.subtask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DogKennels {
    static ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog("Sharik",3), new Dog("Bobik",2)));
    public static void main(String[] args) {
        System.out.println("Сколько собак добавить?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя и возраст");
            String name = sc.next();
            int age = sc.nextInt();
            dogs.add(new Dog(name, age));
        }
        for (Dog dog: dogs) {
            System.out.println(dog + ", human age:" + dog.getHumanAge());
        }

    }
}
