package ru.mirea.lab3.format.subtask1_2;

public class Good {
    private String name;
    private int priceUSD;

    public Good(String name, int priceUSD) {
        this.name = name;
        this.priceUSD = priceUSD;
    }

    public String getName() {
        return name;
    }

    public Good setName(String name) {
        this.name = name;
        return this;
    }

    public int getPriceUSD() {
        return priceUSD;
    }

    public Good setPriceUSD(int priceUSD) {
        this.priceUSD = priceUSD;
        return this;
    }
}
