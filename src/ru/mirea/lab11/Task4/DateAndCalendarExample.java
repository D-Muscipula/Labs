package ru.mirea.lab11.Task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату (ГГГГММДД):");
        String dateInput = scanner.nextLine();

        System.out.println("Введите время (ЧЧмм):");
        String timeInput = scanner.nextLine();

        // Форматы для парсинга ввода пользователя
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

        try {
            // Парсинг введенных данных
            Date date = dateFormat.parse(dateInput);
            Date time = timeFormat.parse(timeInput);

            // Создание объекта Calendar и установка даты и времени
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.HOUR_OF_DAY, getHoursFromTime(time));
            calendar.set(Calendar.MINUTE, getMinutesFromTime(time));

            // Вывод результата
            System.out.println("Дата и время: " + calendar.getTime());
        } catch (ParseException e) {
            System.out.println("Ошибка при вводе данных.");
        } finally {
            scanner.close();
        }
    }

    private static int getHoursFromTime(Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    private static int getMinutesFromTime(Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        return calendar.get(Calendar.MINUTE);
    }
}

