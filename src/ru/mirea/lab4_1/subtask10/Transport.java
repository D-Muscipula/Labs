package ru.mirea.lab4_1.subtask10;

// Абстрактный класс Transport (Транспортное средство)
abstract class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод для расчета времени перевозки пассажиров
    public abstract double calculatePassengerTime(double distance);

    // Метод для расчета стоимости перевозки пассажиров
    public abstract double calculatePassengerCost(double distance);

    // Метод для расчета времени перевозки грузов
    public abstract double calculateCargoTime(double distance);

    // Метод для расчета стоимости перевозки грузов
    public abstract double calculateCargoCost(double distance);
}