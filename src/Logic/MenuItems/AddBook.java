package Logic.MenuItems;

import Logic.Listeners.AddBookListener;

import javax.swing.*;

public class AddBook extends JMenu{
    private static AddBook theInstance;

    private AddBook(){

        super("Edit");
        JMenuItem addBook = new JMenuItem("Add Book");
        addBook.addActionListener(AddBookListener.instance());
        add(addBook);

    }

    public static synchronized AddBook instance(){
        if(theInstance == null){
            theInstance =  new AddBook();
        }
        return theInstance;
    }
}
