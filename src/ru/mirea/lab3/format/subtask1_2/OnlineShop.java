package ru.mirea.lab3.format.subtask1_2;

import java.util.Formatter;
import java.util.Scanner;

import ru.mirea.lab3.format.subtask1_1.CurrencyConverter;

public class OnlineShop {
    static Good[] shop = {new Good("Кроссовки", 100), new Good("Кеды", 90),
            new Good("Ботинки", 85), new Good("Сапоги", 110),
            new Good("Лыжи", 200), new Good("Спортивный костюм", 190)};

    public static void main(String[] args) {
        System.out.println("В какой валюте выводить цены");
        System.out.println("1 - USD");
        System.out.println("2 - EUR");
        System.out.println("3 - RUB");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        for (int i = 0; i < shop.length; i++) {
            Formatter fr = new Formatter();
            if(ch == 1 || ch == 2)
            System.out.println(fr.format("%s - %s %s", i + 1, shop[i].getName(), CurrencyConverter.convert(ch-1, shop[i].getPriceUSD())));
            else
                System.out.println(fr.format("%s - %s %s", i + 1, shop[i].getName(), CurrencyConverter.convert(3, shop[i].getPriceUSD())));
        }
        System.out.println("Введите товар и количество");
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        if(ch == 1 || ch == 2)
        System.out.println("Стоимость: "+ CurrencyConverter.convert(ch-1,shop[g-1].getPriceUSD()*n));
        else
            System.out.println("Стоимость: "+ CurrencyConverter.convert(3,shop[g-1].getPriceUSD()*n));
    }
}
