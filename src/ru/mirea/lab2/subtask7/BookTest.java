package ru.mirea.lab2.subtask7;

public class BookTest {
    public static void main(String[] args) {
// Создаем массив для хранения 10 книг
        Book[] books = new Book[10];

        // Заполняем массив книгами
        books[9] = new Book("Автор1", "Книга", 2000, "Жанр1", "Язык1");
        books[0] = new Book("Автор2", "Книга2", 2001, "Жанр1", "Язык1");
        books[3] = new Book("Автор2", "Книга", 2002, "Жанр1", "Язык1");
        books[2] = new Book("Автор3", "Книга4", 2003, "Жанр2", "Язык1");
        books[7] = new Book("Автор3", "Книга5", 2004, "Жанр2", "Язык1");
        books[6] = new Book("Автор6", "Книга6", 2005, "Жанр2", "Язык1");
        books[5] = new Book("Автор7", "Книга7", 2006, "Жанр3", "Язык7");
        books[4] = new Book("Автор8", "Книга8", 2007, "Жанр3", "Язык8");
        books[8] = new Book("Автор9", "Книга9", 2008, "Жанр3", "Язык9");
        books[1] = new Book("Автор10", "Книга10", 2009, "Жанр10", "Язык10");
        BookShelf shelf = new BookShelf(10, books);
        for (int i = 0; i < 10; i++) {
            System.out.println(shelf.getBooks()[i]);
        }
        System.out.println("Наименьший год: " + shelf.min());
        System.out.println("Наибольший год: " + shelf.max());
        shelf.sort();
        for (int i = 0; i < 10; i++) {
            System.out.println(shelf.getBooks()[i]);
        }
    }
}
