package ru.mirea.lab24.Task1;

public interface ComplexAbstractFactory {
    ComplexNumber createComplex();
    ComplexNumber createComplex(int real, int imaginary);
    ComplexOperation createComplexOperation();
}
