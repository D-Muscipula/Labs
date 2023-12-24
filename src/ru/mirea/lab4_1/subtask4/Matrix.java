package ru.mirea.lab4_1.subtask4;

public class Matrix {
    private double[][] data;  // Двумерный массив для хранения данных матрицы
    private int rows;         // Количество строк в матрице
    private int columns;      // Количество столбцов в матрице

    // Конструктор для создания матрицы с указанными размерами
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    // Метод для заполнения матрицы заданными данными
    public void fillMatrix(double[][] values) {
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Размеры входной матрицы не соответствуют размерам текущей матрицы.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    // Метод для вывода матрицы на экран
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для сложения текущей матрицы с другой матрицей
    public void addMatrix(Matrix otherMatrix) {
        if (otherMatrix.rows != rows || otherMatrix.columns != columns) {
            System.out.println("Невозможно сложить матрицы разных размеров.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] += otherMatrix.data[i][j];
            }
        }
    }

    // Метод для умножения матрицы на скаляр
    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] *= scalar;
            }
        }
    }
}

