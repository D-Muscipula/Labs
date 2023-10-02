package ru.mirea.lab4.Task3;

public enum Good {
    TIE(1000, "Галстук"),       // Пример значения cost и nameInRussian для каждого элемента
    SHIRT(2000, "Рубашка"),
    PANTS(3000, "Брюки"),
    SNEAKERS(7000, "Кроссовки"),
    BOOTS(5000, "Ботинки"),
    CHICKEN(280, "Курица"),
    RABBIT(600, "Кролик"),
    BEEF(500, "Говядина");

    private int cost;
    private String nameInRussian;

    Good(int cost, String nameInRussian) {
        this.cost = cost;
        this.nameInRussian = nameInRussian;
    }

    public int getCost() {
        return cost;
    }

    public String getNameInRussian() {
        return nameInRussian;
    }
}
