package Logic.MenuItems;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    private static MenuBar theInstance;
    private static JPanel bookPanel;

    private MenuBar(JPanel bookPanel){
        add(SortMenu.instance(bookPanel));
        add(AddBook.instance());


    }



    public static synchronized MenuBar instance(JPanel bookPanel){
        if(theInstance == null){
            theInstance =  new MenuBar(bookPanel);
        }
        return theInstance;
    }
}
