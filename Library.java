import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        File f = new File("files", fileName);
        try {
            Scanner in = new Scanner(f);
            while(in.hasNextLine()) {
                books.add(new Book(in));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }

    public void reviewBook(String title, String author, String genre, int rating) {
        Book b = new Book.Builder(title)
        .author(author)
        .genre(genre)
        .rating(rating)
        .build();

        books.add(b);
        saveToFile();
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
}
