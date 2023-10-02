package ru.mirea.lab3.format.subtask1_1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    static double dolToEu = 0.94;
    public static String convert(int ch, int n){
        NumberFormat d = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat e = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        if(ch == 1){
            return e.format(dolToEu*n);
        }
        else if(ch == 2){
            return d.format(n*(1/dolToEu));
        }
        else if(ch == 3){
            return String.valueOf(95*n) + " рублей";
        }
        else if(ch == 0){
            return d.format(n);
        }
        else return "oof";
    }
    public static void main(String[] args) {
        System.out.println("Выберите:");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Доллары в евро");
        System.out.println("2 - Евро в доллары");
        int choice = sc.nextInt();
        System.out.println("Введите количество");
        int n = sc.nextInt();
        System.out.println(convert(choice,n));;


    }
}


