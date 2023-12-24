package ru.mirea.lab4_1.subtask5;

public class Reader {
    private String fullName;
    private int readerCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerCardNumber = readerCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    // Метод для вывода информации о взятии книг
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    // Метод для вывода информации о взятии книг с переменным числом названий книг
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Метод для вывода информации о взятии книг с переменным числом объектов Book
    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    // Метод для вывода информации о возврате книг
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    // Метод для вывода информации о возврате книг с переменным числом названий книг
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Метод для вывода информации о возврате книг с переменным числом объектов Book
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}
