package ru.mirea.lab4.Task2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела штаны");
    }
}
