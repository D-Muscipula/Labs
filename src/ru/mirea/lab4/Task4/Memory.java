package ru.mirea.lab4.Task4;

public class Memory {
    private String type;
    private int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public Memory setType(String type) {
        this.type = type;
        return this;
    }

    public int getSize() {
        return size;
    }

    public Memory setSize(int size) {
        this.size = size;
        return this;
    }
}
