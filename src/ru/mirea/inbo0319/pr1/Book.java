package ru.mirea.inbo0319.pr1;

public class Book {
    private String heading;
    private String genre;

    public Book(String heading, String genre){
        this.heading = heading;
        this.genre = genre;
    }
    public Book(String heading){
        this.heading = heading;
        this.genre = " without a genre";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getGenre() {
        return genre;
    }
    public String getHeading() {
        return heading;
    }

    public String toString() {
        return heading + ", " + genre;
    }
}
