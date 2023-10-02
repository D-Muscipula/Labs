package ru.mirea.lab4.Task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Женщина надела футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку");
    }
}
