package ru.mirea.lab2.subtask10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        //System.out.println(args.length);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        System.out.println(words.length);
    }
}
