package ru.mirea.lab4.Task1;

public enum Season {
    WINTER(-10), SPRING(10),  SUMMER(25), AUTUMN(10);
    private final double avTemp;

    Season(double avTemp){
        this.avTemp = avTemp;
    }

    public double getAvTemp() {
        return avTemp;
    }

    public String getDescription(){
        if (this == SUMMER) return "Теплое время года";
        return "Холодное время года";
    }
}
