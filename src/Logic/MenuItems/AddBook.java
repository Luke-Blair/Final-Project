package Logic.MenuItems;

import javax.swing.*;

public class AddBook extends JMenu{
    private static AddBook theInstance;

    private AddBook(){
        super("Add Book");

    }

    public static synchronized AddBook instance(){
        if(theInstance == null){
            theInstance =  new AddBook();
        }
        return theInstance;
    }
}
