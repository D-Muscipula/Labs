package ru.mirea.lab24.Task1;

public class ConcreteComplexNumber implements ComplexNumber {
    private int real;
    private int imaginary;

    public ConcreteComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ConcreteComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getRealPart() {
        return 0;
    }

    @Override
    public double getImaginaryPart() {
        return 0;
    }
}