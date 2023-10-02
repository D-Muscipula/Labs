package ru.mirea.lab3.wrapper;

public class Main {
    public static void main(String[] args) {
        Double d = Double.valueOf(19.5);
        Double d1 = Double.valueOf(10.25);
        Double d2 = Double.valueOf(8);
        String s = "19.1";
        Double d3 = Double.parseDouble(s);
        byte a = d.byteValue();
        int b = d.intValue();
        short c = d.shortValue();
        float df = d.floatValue();
        double dd = d.doubleValue();
        long l = d.longValue();
        System.out.println("Значение: " + d);
        String sd = Double.toString(3.14);
    }
}
