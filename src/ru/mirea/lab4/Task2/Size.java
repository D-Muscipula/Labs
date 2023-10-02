package ru.mirea.lab4.Task2;

public enum Size {
    XXS(32), XS(34),
    S(36), M(38), L(40);
    private int euroSize;
    public String getDescription(){
        if (this == XXS) return "Детский размер";
        return "Взрослый размер";
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
}
