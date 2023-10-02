package ru.mirea.lab4.Task2;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку");
    }
}
