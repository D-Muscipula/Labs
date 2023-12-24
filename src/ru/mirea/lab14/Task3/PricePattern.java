package ru.mirea.lab14.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PricePattern {
    public static void main(String[] args) {
        String regex = "[^.0](\\d+(\\.\\d{1,2})?)\\s+(USD|RUB|EU)\\b";
        String input = "Стоимость: 25.98 USD, 100.00 RUB, 12.50 EU. 0.00003 EU";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(3);
            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
