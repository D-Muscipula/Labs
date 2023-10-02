package ru.mirea.lab2.subtask7;


public class BookShelf {
    private int n;
    private Book[] books;

    public Book min() {
        int mini = Integer.MAX_VALUE;
        Book temp = null;
        for (Book book :
                books) {
            if (mini > book.getYear()) {
                mini = book.getYear();
                temp = book;
            }
        }
        return temp;
    }

    public Book max() {
        int maxi = Integer.MIN_VALUE;
        Book temp = null;
        for (Book book :
                books) {
            if (maxi < book.getYear()) {
                maxi = book.getYear();
                temp = book;
            }
        }
        return temp;
    }

    public BookShelf(int n, Book[] books) {
        this.n = n;
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void sort() {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j].getYear() > books[j+1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                    flag = true;
                }

            }
            if (!flag) break;
        }
    }
}
