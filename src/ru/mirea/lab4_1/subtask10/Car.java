package ru.mirea.lab4_1.subtask10;

class Car extends Transport {
    private double speed;
    private double passengerRate;
    private double cargoRate;

    public Car(String name, double speed, double passengerRate, double cargoRate) {
        super(name);
        this.speed = speed;
        this.passengerRate = passengerRate;
        this.cargoRate = cargoRate;
    }

    @Override
    public double calculatePassengerTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculatePassengerCost(double distance) {
        return distance * passengerRate;
    }

    @Override
    public double calculateCargoTime(double distance) {
        return distance / (speed * 0.8); // Автомобиль обычно двигается медленнее с грузом
    }

    @Override
    public double calculateCargoCost(double distance) {
        return distance * cargoRate;
    }
}
