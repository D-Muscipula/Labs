package ru.mirea.lab2.subtask7;

public class Book {
    private String author;
    private String name;
    private int year;
    private String genre;
    private String language;

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Book setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Book setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Book(String author, String name, int year, String genre, String language) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
