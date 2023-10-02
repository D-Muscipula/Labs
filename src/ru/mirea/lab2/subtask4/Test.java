package ru.mirea.lab2.subtask4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во");
        int n = sc.nextInt();
        Shop shop = new Shop();
        System.out.println("Введите названия пк");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            shop.add(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(shop.getComputers()[i]);
        }
        System.out.println("Введите компьютер для удаления");
        shop.delete(sc.nextLine());
        for (int i = 0; i < shop.getComputers().length; i++) {
            System.out.println(shop.getComputers()[i]);
        }
        System.out.println("Введите компьютер для проверки наличия");
        System.out.println(shop.search(sc.nextLine()));
    }
}
