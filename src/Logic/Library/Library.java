package Logic.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Represents 1 library of books
 */
public class Library {
    private static Library theInstance;
    private String fileName;
    private ArrayList<Book> books;

    /**
     * Private constructor for Library that sets the fileName to nothing and
     * establishes the arraylist
     */
    private Library(){
        fileName = "";
        books = new ArrayList<>();
    }

    /**
     * Singleton case for the Library
     * @return the single Library class
     */
    public static synchronized Library instance(){
        if(theInstance == null){
            theInstance = new Library();
        }
        return theInstance;
    }

    /**
     * Takes in a file name and reads it, creating the arraylist of books
     * @param fileName the file to be read
     */
    public void readFile(String fileName) {
        this.fileName = fileName;
        File f = new File(fileName);
        try {
            System.out.println(f.getName());
            Scanner in = new Scanner(f);
            while(in.hasNextLine()) {
                books.add(new Book(in));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            //e.printStackTrace();
        }
    }

    /**
     * Adds the specified book to the arraylist
     * @param b the book to be added
     */
    public void addBook(Book b) {
        books.add(b);
    }

    /**
     * Writes to the file the books in the arraylist
     */
    public void saveToFile() {
        File f = new File("IdeaProjects/" + fileName);
        try {
            PrintWriter out = new PrintWriter(f);
            for(Book b : books) {
                b.save(out);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }

    /**
     * Returns the arraylist of books
     * @return the arraylist of books
     */
    public ArrayList<Book> getList() {
        return books;
    }

    /**
     * Sorts the arraylist by genre
     * @param genre the specified genre
     */
    public void sortByGenre(Genre genre) {
        for(int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if(b.getGenre() == genre) {
                books.add(0,books.remove(i));
            }
        }
    }

    /**
     * Sorts the arraylist by rating and then updates the file
     */
    public void sortByRating(boolean lowToHigh) {
        if(lowToHigh) {
            for (int i = 0; i < books.size(); i++) {
                for (int j = i + 1; j < books.size(); j++) {
                    if (books.get(j).getRating() < books.get(i).getRating()) {
                        Book b = books.remove(j);
                        books.add(i, b);
                    }
                }
            }
        } else {
            for (int i = 0; i < books.size(); i++) {
                for (int j = i + 1; j < books.size(); j++) {
                    if (books.get(j).getRating() > books.get(i).getRating()) {
                        Book b = books.remove(j);
                        books.add(i, b);
                    }
                }
            }
        }
    }
}
