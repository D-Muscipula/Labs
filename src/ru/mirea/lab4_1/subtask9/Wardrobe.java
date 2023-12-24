package ru.mirea.lab4_1.subtask9;

class Wardrobe extends Furniture {
    public Wardrobe(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Шкаф " + getName();
    }
}
