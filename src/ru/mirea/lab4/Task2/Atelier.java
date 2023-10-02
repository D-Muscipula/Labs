package ru.mirea.lab4.Task2;

public class Atelier {
    public static void dressWomen(Clothes[] clothes){
        for (Clothes c:
             clothes) {
            if(c instanceof WomenClothing){
                System.out.println("Размер: " + c.getSize());
                System.out.println("Цвет: " + c.getColor());
                ((WomenClothing) c).dressWoman();
            }
        }
    }
    public static void dressMan(Clothes[] clothes){
        for (Clothes c:
                clothes) {
            if(c instanceof MenClothing){
                System.out.println("Размер: " + c.getSize());
                System.out.println("Цвет: " + c.getColor());
                ((MenClothing) c).dressMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] allClothes = {
                new TShirt(Size.L, 1800, "Красный"),
                new TShirt(Size.M, 1700, "Оранжевый"),
                new Pants(Size.S, 30, "Желтый"),
                new Pants(Size.XXS, 5000, "Зеленый"),
                new Skirt(Size.L, 3050, "Голубой"),
                new Tie(Size.M, 1500, "Синий")
        };

        dressWomen(allClothes);
        dressMan(allClothes);
    }
}
