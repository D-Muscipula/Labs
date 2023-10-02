package ru.mirea.lab4.Task1;

public class Seasons {
    public static void season(Season s){
        System.out.print("Я люблю ");
        switch (s){
            case WINTER -> System.out.println("зиму");
            case SPRING -> System.out.println("весну");
            case SUMMER -> System.out.println("лето");
            case AUTUMN -> System.out.println("осень");
        }
    }
    public static void main(String[] args) {
        Season s = Season.WINTER;
        season(s);
        System.out.println(Season.SUMMER.getDescription());
        for (Season st: Season.values()) {
            System.out.print(st + " " + st.getAvTemp() + " " + st.getDescription() + " ");
            season(st);
        }
    }
}
