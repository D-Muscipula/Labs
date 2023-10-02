package ru.mirea.lab4.Task4;

public class Processor {
    private int cpuCore;
    private int clockSpeed;

    public Processor(int cpuCore, int clockSpeed) {
        this.cpuCore = cpuCore;
        this.clockSpeed = clockSpeed;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public Processor setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
        return this;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public Processor setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        return this;
    }
}
