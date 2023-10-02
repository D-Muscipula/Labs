package ru.mirea.lab4.Task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Computer setProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    public Memory getMemory() {
        return memory;
    }

    public Computer setMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computer setMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public Computer setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }
}
