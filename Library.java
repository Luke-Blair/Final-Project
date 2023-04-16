import java.io.File;
import java.io.FileNotFoundException;
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
}
