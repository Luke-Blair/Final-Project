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
    }
}//end of book class