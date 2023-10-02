package ru.mirea.lab2.subtask9;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public Card setSuit(String suit) {
        this.suit = suit;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Card setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return value  + " " + suit;
    }
}
