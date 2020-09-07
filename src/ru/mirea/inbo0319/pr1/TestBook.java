package ru.mirea.inbo0319.pr1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Liverpool", "romance");
        Book b2 = new Book("War and piece");

        System.out.println(b1);

        b2.setGenre("criminal");
        System.out.println(b2);
    }
}
