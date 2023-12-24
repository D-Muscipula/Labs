package ru.mirea.lab4_1.subtask9;

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }


    public String getDescription() {
        return "Стол " + getName();
    }
}
