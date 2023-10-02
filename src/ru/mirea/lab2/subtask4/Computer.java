package ru.mirea.lab2.subtask4;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }

}
