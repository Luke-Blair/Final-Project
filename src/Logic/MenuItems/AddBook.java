package Logic.MenuItems;
import Logic.Listeners.AddBookListener;
import javax.swing.*;

/**
 * this class is an extension of JMenu, and is represented by "edit" on the JMenuBar. This class also holds the
 * JMenu Item "Add Book"
 */



public class AddBook extends JMenu{
    private static AddBook theInstance;

    /**
     * default constructor
     */

    private AddBook(){

        super("Edit");
        JMenuItem addBook = new JMenuItem("Add Book");
        addBook.addActionListener(AddBookListener.instance());
        add(addBook);

    }

    /**
     * singleton constructor
     * @return theInstance
     */

    public static synchronized AddBook instance(){
        if(theInstance == null){
            theInstance =  new AddBook();
        }
        return theInstance;
    }
}
