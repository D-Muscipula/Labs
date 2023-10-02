package ru.mirea.lab4.Task4;

public class Main {
    Processor processor = new Processor(4, 3000);
    Memory memory = new Memory("DDR4", 16);
    Monitor monitor = new Monitor(27);
    // Выбираем марку компьютера из перечисления Brand
    Brand brand = Brand.DELL;

    // Создаем объект компьютера
    Computer computer = new Computer(processor, memory, monitor, brand);
}
