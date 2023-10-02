package ru.mirea.lab2.subtask1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("D.C","so@.com",'m');
        System.out.println(author);
        author.setEmail("sosdsdff@.com");
        System.out.println(author.getEmail());

    }

}
