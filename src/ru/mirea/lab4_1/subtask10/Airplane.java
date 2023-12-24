package ru.mirea.lab4_1.subtask10;

// Подкласс Airplane (Самолет)
class Airplane extends Transport {
    private double speed;
    private double passengerRate;
    private double cargoRate;

    public Airplane(String name, double speed, double passengerRate, double cargoRate) {
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
        return distance / (speed * 0.9); // Самолет обычно двигается медленнее с грузом
    }

    @Override
    public double calculateCargoCost(double distance) {
        return distance * cargoRate;
    }
}
