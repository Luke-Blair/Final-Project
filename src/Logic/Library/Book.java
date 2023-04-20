package Logic.Library;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Represents a book object
 */
public class Book {
    private String name;
    private int rating;
    private Genre genre;
    private String author;

    /**
     * Builder method of creating a book
     */
    public static class Builder{
        private String name;
        private int rating = 0;
        private Genre genre = Genre.Other;
        private String author = "Unknown";

        /**
         * Constructor for book builder
         * @param name the title of the book
         */
        public Builder(String name){
            this.name = name;
        }

        /**
         * Adds the rating to the book
         * @param r the rating
         * @return the rating
         */
        public Builder rating(int r){
            rating = r;
            return this;
        }

        /**
         * Adds the genre to the book
         * @param g the genre
         * @return the genre
         */
        public Builder genre(String g){
            genre = Genre.valueOf(g);
            return this;
        }

        /**
         * Adds the author to the book
         * @param a the author
         * @return the author
         */
        public Builder author(String a){
            author = a;
            return this;
        }

        /**
         * Creates the book object
         * @return the book object
         */
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
        int i = 0;
        System.out.println(i);
        i++;
        this.name = in.nextLine();
        this.rating = Integer.parseInt(in.nextLine());
        this.genre = Genre.valueOf(in.nextLine());
        this.author = in.nextLine();
        if(in.hasNextLine()){
            in.nextLine();
        }

    }

    /**
     * Writes the book to the file
     * @param out the print writer that writes to the file
     */
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