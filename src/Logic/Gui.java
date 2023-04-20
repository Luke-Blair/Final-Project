package Logic;

import Layouts.*;
import Logic.MenuItems.MenuBar;
import Logic.MenuItems.SortMenu;

import javax.swing.*;
import java.awt.*;

public class Gui {

    private static Gui theInstance;
    final int RESULTS_PER_PAGE = 10;

    /**
     * Singleton pattern for Logic.Gui object
     * @return theInstance an instance of the Logic.Gui object
     */
    public static synchronized Gui instance(){
        if (theInstance == null){
            theInstance = new Gui();
        }
        return theInstance;
    }

    /**
     * Default constructor for the Logic.Gui object
     */
    private Gui(){


    }

    /**
     * Constructs a JFrame object inside the Logic.Gui, the method then loads the
     * parts required to construct the visual graphics of our project.
     */
    public void build(){
        JFrame frame = new ProjectFrame("Logic.Library.Book-Byte");

        //Panel used to hold all other panels
        JPanel parentPanel = new ParentLayout();

        //Panel used to display selectedBook's info
        JPanel infoPanel = new BookInfo();

        //Panel used to hold all selectable books
         JPanel bookPanel = new BookList((BookInfo) infoPanel, 0, 7);

         //Panel used to hold forward back button for pages
        JPanel fbPannel = new PgFowardBack((BookList) bookPanel);

        //Creates the Menu Bar that has sort and add
        JMenuBar menuBar = MenuBar.instance(bookPanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //adding child panel to parent panel
        parentPanel.add(infoPanel, BorderLayout.PAGE_START);
        bookPanel.add(fbPannel);
        parentPanel.add(bookPanel, BorderLayout.CENTER);


        frame.add(parentPanel);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setSize(1100, 700);
        frame.setVisible(true);

    }
}
