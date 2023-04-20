package Logic.MenuItems;

import javax.swing.*;

/**
 * Represents the menu for the program, includes sort algorithms
 * and add book
 */
public class MenuBar extends JMenuBar {

    private static MenuBar theInstance;
    private static JPanel bookPanel;

    /**
     * Private Constructor for the menu
     * @param bookPanel
     */
    private MenuBar(JPanel bookPanel){
        add(SortMenu.instance(bookPanel));
        add(AddBook.instance());


    }

    /**
     * Singleton Case for the menu
     * @param bookPanel the panel it reads in
     * @return the 1 menu
     */
    public static synchronized MenuBar instance(JPanel bookPanel){
        if(theInstance == null){
            theInstance =  new MenuBar(bookPanel);
        }
        return theInstance;
    }
}
