package ru.mirea.lab4_1.subtask10;

public class Test {
    public static void main(String[] args) {
        Transport car = new Car("Автомобиль", 100.0, 0.1, 0.05);
        Transport airplane = new Airplane("Самолет", 900.0, 0.2, 0.1);
        Transport train = new Train("Поезд", 120.0, 0.08, 0.04);
        Transport ship = new Ship("Корабль", 50.0, 0.15, 0.03);

        double distance = 500.0;

        System.out.println("Перевозка пассажиров:");
        System.out.println(car.getName() + ": Время - " + car.calculatePassengerTime(distance) + " ч, Стоимость - " + car.calculatePassengerCost(distance) + " руб.");
        System.out.println(airplane.getName() + ": Время - " + airplane.calculatePassengerTime(distance) + " ч, Стоимость - " + airplane.calculatePassengerCost(distance) + " руб.");
        System.out.println(train.getName() + ": Время - " + train.calculatePassengerTime(distance) + " ч, Стоимость - " + train.calculatePassengerCost(distance) + " руб.");
        System.out.println(ship.getName() + ": Время - " + ship.calculatePassengerTime(distance) + " ч, Стоимость - " + ship.calculatePassengerCost(distance) + " руб.");

        System.out.println("\nПеревозка грузов:");
        System.out.println(car.getName() + ": Время - " + car.calculateCargoTime(distance) + " ч, Стоимость - " + car.calculateCargoCost(distance) + " руб.");
        System.out.println(airplane.getName() + ": Время - " + airplane.calculateCargoTime(distance) + " ч, Стоимость - " + airplane.calculateCargoCost(distance) + " руб.");
        System.out.println(train.getName() + ": Время - " + train.calculateCargoTime(distance) + " ч, Стоимость - " + train.calculateCargoCost(distance) + " руб.");
        System.out.println(ship.getName() + ": Время - " + ship.calculateCargoTime(distance) + " ч, Стоимость - " + ship.calculateCargoCost(distance) + " руб.");
    }
}
