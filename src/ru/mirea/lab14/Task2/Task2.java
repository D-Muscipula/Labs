package ru.mirea.lab14.Task2;

public class Task2 {
    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        String input = "abcdefghijklmnopqrstuv183140";

        if (input.matches(regex)) {
            System.out.println("Совпадает");
        } else {
            System.out.println("Не совпадает");
        }
    }
}
