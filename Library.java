import java.util.ArrayList;
public class Library {
    private static Library theInstance;
    private ArrayList<Book> books;
    private Library(){

    }
    public static synchronized Library instance(){
        if(theInstance == null){
            theInstance = new Library();
        }
        return theInstance;
    }
}
