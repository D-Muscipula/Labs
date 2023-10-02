package ru.mirea.lab4.Task2;

public class Tie extends Clothes implements MenClothing{
    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук");
    }
}
