package Logic;

import java.io.PrintWriter;
import java.util.Scanner;

public class Book {
    private String name;
    private int rating;
    private Genre genre;
    private String author;
    public static class Builder{
        private String name;
        private int rating = 0;
        private Genre genre = Genre.Other;
        private String author = "Unknown";
        public Builder(String name){
            this.name = name;
        }
        public Builder rating(int r){
            rating = r;
            return this;
        }
        public Builder genre(String g){
            genre = Genre.valueOf(g);
            return this;
        }
        public Builder author(String a){
            author = a;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }//end of builder class

    /**
     * Uses a builder to create a book object
     * @param builder the builder to create the book object
     */
    private Book(Builder builder){
        String name = builder.name;
        int rating = builder.rating;
        Genre genre = builder.genre;
        String author = builder.author;
    }

    /**
     * Reads the file and creates the book object
     * @param in the scanner to read the file
     */
    public Book(Scanner in) {
        this.name = in.nextLine();
        this.rating = Integer.parseInt(in.nextLine());
        this.genre = Genre.valueOf(in.nextLine());
        this.author = in.nextLine();
        in.nextLine();
    }

    public void save(PrintWriter out) {
        out.println(name);
        out.println(rating);
        out.println(genre);
        out.println(author);
        out.println("");
    }

    /**
     * Gets name of book
     * @return name of book
     */
    public String getName() {
        return name;
    }

    /**
     * Gets author of book
     * @return author of book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets rating of book
     * @return rating of book
     */
    public int getRating() {
        return rating;
    }

    /**
     * Gets genre of book
     * @return genre of book
     */
    public Genre getGenre() {
        return genre;
    }
}//end of book class