package ru.mirea.lab4.Task2;

public abstract class Clothes {
    private Size size;
    private int cost;
    private String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public Clothes setSize(Size size) {
        this.size = size;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public Clothes setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Clothes setColor(String color) {
        this.color = color;
        return this;
    }
}
