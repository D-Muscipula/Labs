package ru.mirea.lab4.Task3;

public enum Category {
    CLOTHES(new Good[]{Good.TIE, Good.SHIRT, Good.PANTS, Good.SNEAKERS, Good.BOOTS}, "Одежда"),
    SHOES(new Good[]{Good.SNEAKERS, Good.BOOTS}, "Обувь"),
    MEAT(new Good[]{Good.CHICKEN, Good.RABBIT, Good.BEEF}, "Мясо");

    private final Good[] goods;
    private final String nameInRussian;

    Category(Good[] goods, String nameInRussian) {
        this.goods = goods;
        this.nameInRussian = nameInRussian;
    }

    public Good[] getGoods() {
        return goods;
    }

    public String getNameInRussian() {
        return nameInRussian;
    }
}

