package ru.mirea.lab9.Task4;

public class Comp implements Comparable{
    @Override
    public int compareTo(Object obj) {
        return this.hashCode() - obj.hashCode();
    }
}
