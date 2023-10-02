package ru.mirea.lab4.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("abc", "12345"));
        users.add(new User("admin", "123"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String log = sc.next();
        System.out.println("Введите пароль");
        String pas = sc.next();
        boolean flag = false;
        while (!flag) {
            for (User u :
                    users) {
                if (u.getLogin().equals(log) && u.getPassword().equals(pas)) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            {
                System.out.println("Неправильный логин или пароль");
                System.out.println("Введите логин");
                log = sc.next();
                System.out.println("Введите пароль");
                pas = sc.next();
            }
        }
        System.out.println("Каталоги: ");
        for (Category c :
                Category.values()) {
            System.out.println(c.getNameInRussian());}
        System.out.println("Введите каталог");
        String cate = sc.next();
        Category categ = Category.CLOTHES;
        for (Category c :
                Category.values()) {
            if (c.getNameInRussian().equals(cate))
            {
                categ = c;
                var g = c.getGoods();
            for (Good good:
                 g) {
                System.out.print(good.getNameInRussian() + " цена:" + good.getCost()+ "  ");
            }
            System.out.println();
        }}
        System.out.println("Введите товар");
        System.out.println("Для окончания наберите \"Окончить\"");
        String ng = sc.next();
        while (!ng.equals("Окончить")){
            var goods = categ.getGoods();
            for (Good g:
                 goods) {
                if(g.getNameInRussian().equals(ng))
                    User.add(g);
            }
            System.out.println("Введите товар");
            System.out.println("Для окончания наберите \"Окончить\"");
            ng = sc.next();
        }
        System.out.println("Вы должны: " + User.getSum());
    }
}
