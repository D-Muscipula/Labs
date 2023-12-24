package ru.mirea.lab4_1.subtask9;


class Bed extends Furniture {
    public Bed(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Кровать " + getName();
    }
}