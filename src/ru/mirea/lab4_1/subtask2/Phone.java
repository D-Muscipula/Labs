package ru.mirea.lab4_1.subtask2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)
    public Phone(String number, String model) {
        this(number, model, 0.0); // Вызываем конструктор с тремя параметрами и передаем weight = 0.0
    }

    // Конструктор без параметров (вызывает конструктор с двумя параметрами)
    public Phone() {
        this("N/A", "N/A"); // Вызываем конструктор с двумя параметрами и передаем default значения
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для принятия звонка
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод для принятия звонка с указанием номера звонящего
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    // Метод для отправки сообщения переменной длины
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправлено сообщение на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // Метод для вывода информации о телефоне
    public void displayInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " г");
    }

    public static void main(String[] args) {
        // Создаем экземпляры класса Phone с разными конструкторами
        Phone phone1 = new Phone("123456789", "iPhone 12", 162.0);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        // Выводим информацию о телефонах
        phone1.displayInfo();
        System.out.println();
        phone2.displayInfo();
        System.out.println();
        phone3.displayInfo();
        System.out.println();

        // Вызываем метод receiveCall
        phone1.receiveCall("Иван");
        phone2.receiveCall("Мария", "555-123-456");
        System.out.println();

        // Вызываем метод sendMessage
        phone1.sendMessage("111-222-333", "444-555-666");
    }
}