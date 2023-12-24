package ru.mirea.lab4_1.subtask9;

public class Test {
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop(7);
        Table table = new Table("Стол1", 2500.0);
        Bed bed = new Bed("Кровать1", 3500.0);
        Wardrobe wardrobe = new Wardrobe("Шкаф1", 1800.0);


        furnitureShop.addFurniture(table, 0);
        furnitureShop.addFurniture(bed, 1);
        furnitureShop.addFurniture(wardrobe, 2);

        furnitureShop.listInventory();
    }
}
