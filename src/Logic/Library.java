package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {
    private static Library theInstance;
    private String fileName;
    private ArrayList<Book> books;
    private Library(){
        fileName = "";
        books = new ArrayList<>();
    }
    public static synchronized Library instance(){
        if(theInstance == null){
            theInstance = new Library();
        }
        return theInstance;
    }

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

    public void addBook(Book b) {
        books.add(b);
    }

    public void saveToFile() {
        File f = new File("users/" + fileName);
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

    public ArrayList<Book> getList() {
        return books;
    }

    public void sortByGenre(Genre genre) {
        ArrayList<Book> newBooks = new ArrayList<>();

        // Add all books by genre first
        for(Book b : books) {
            if(b.getGenre() == genre) {
                newBooks.add(b);
                books.remove(b);
            }
        }

        // Add the rest
        for(Book b : books) {
            newBooks.add(b);
            books.remove(b);
        }
        books = newBooks;
    }

    public void sortByRating() {
        for(int i = 0; i < books.size() - 1; i++) {
            for(int j = 0; j < books.size() - 1 - i; j++) {
                if(books.get(j).getRating() > books.get(i).getRating()) {
                    Book temp = books.get(j);
                    books.remove(j);
                    books.add(j, books.get(j+1));
                    books.remove(j+1);
                    books.add(j+1, temp);
                }
            }
        }
    }
}
