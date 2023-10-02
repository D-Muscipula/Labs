package ru.mirea.lab2.subtask9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"Червей", "Пик", "Бубен", "Треф"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз", "Джокер"};
        ArrayList<Card> cards = new ArrayList<>();
        for (String suit :
                suits) {
            for (String value :
                    values) {
                if(!value.equals("Джокер")) cards.add(new Card(suit, value));
                else if (suit.equals(suits[0])) {
                    cards.add(new Card("Красный",value));
                }
                else if(suit.equals(suits[1])){
                    cards.add(new Card("Черный",value));
                }

            }

        }
        /*for (Card card :
                cards) {
            System.out.println(card);

        }
        for (Card card :
                cards) {
            System.out.println(card);

        }
        System.out.println(cards.size());*/
        Collections.shuffle(cards);
        System.out.println("Введите количество игроков");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n*5; i++) {
            System.out.print(cards.get(i)+ " || ");
            if(i % 5 == 4) System.out.println();
        }
    }
}
