package ru.mirea.lab2.subtask8;

public class Reverse {
    public static void main(String[] args) {
        String[] strings = {"a","b","c","d","e","f","g","h","i","j"};
        String[] strings1 = {"a","b","c","d","e","f","g","h","i","j","k"};
        for (int i = 0; i < 10; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 10/2; i++) {
            String temp = strings[i];
            strings[i] = strings[10-1-i];
            strings[10-1-i] = temp;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print(strings1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 11/2; i++) {
            String temp = strings1[i];
            strings1[i] = strings1[11-1-i];
            strings1[11-1-i] = temp;
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(strings1[i]+" ");
        }
    }
}
