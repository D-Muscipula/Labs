package ru.mirea.lab4_1.subtask9;

public class FurnitureShop {
        private Furniture[] inventory;

        public FurnitureShop(int size) {
            inventory = new Furniture[size];
        }

        // Добавление мебели в магазин
        public void addFurniture(Furniture furniture, int index) {
            if (index >= 0 && index < inventory.length) {
                inventory[index] = furniture;
            }
        }

        // Получение информации о мебели в магазине
        public void listInventory() {
            System.out.println("Инвентарь магазина мебели:");
            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] != null) {
                    Furniture item = inventory[i];
                    System.out.println((i + 1) + ". " + item.getDescription() + " - Цена: " + item.getPrice() + " руб.");
                }
            }
        }
    }

