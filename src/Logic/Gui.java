package Logic;

import Layouts.*;

import javax.swing.*;
import java.awt.*;

public class Gui {

    private static Gui theInstance;
    final int RESULTS_PER_PAGE = 10;

    /**Singleton pattern for Logic.Gui object
     *
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
     *
     * @returns Logic.Gui a Logic.Gui object
     */
    private Gui(){


    }

    /**
     * Constructs a JFrame object inside the Logic.Gui, the method then loads the
     * parts required to construct the visual graphics of our project.
     */
    public void build(){
        JFrame frame = new ProjectFrame("Logic.Book-Byte");

        //Panel used to hold all other panels
        JPanel parentPanel = new ParentLayout();

        //Panel used to display selectedBook's info
        JPanel infoPanel = new BookInfo();

        //Panel used to hold all selectable books
         JPanel bookPanel = new BookList((BookInfo) infoPanel, 0, 7);

         //Panel used to hold forward back button for pages
        JPanel fbPannel = new PgFowardBack((BookList) bookPanel);

        //Creates the Menu Bar that has sort and add
        JMenuBar menuBar = new JMenuBar();
        JMenu sort = new JMenu("Sort By");

        JMenuItem adventure = new JMenuItem("Adventure", null);
        adventure.setToolTipText("Sort by Adventure Books");
        adventure.addActionListener(new GenreListener("Adventure", (BookList) bookPanel));

        JMenuItem horror = new JMenuItem("Horror", null);
        horror.setToolTipText("Sort by Horror Books");
        horror.addActionListener(new GenreListener("Horror", (BookList) bookPanel));

        JMenuItem mystery = new JMenuItem("Mystery",null);
        mystery.setToolTipText("Sort by Mystery Books");
        mystery.addActionListener(new GenreListener("Mystery", (BookList) bookPanel));

        JMenuItem other = new JMenuItem("Other",null);
        other.setToolTipText("Sort by Other Books");
        other.addActionListener(new GenreListener("Other", (BookList) bookPanel));

        JMenuItem highRating = new JMenuItem("Rating (Highest)",null);
        highRating.setToolTipText("Sort by Highest Book Rating");
        highRating.addActionListener(new RatingListener(false, (BookList) bookPanel));

        JMenuItem lowRating = new JMenuItem("Rating (Lowest)",null);
        lowRating.setToolTipText("Sort by Lowest Book Rating");
        lowRating.addActionListener(new RatingListener(true, (BookList) bookPanel));

        sort.add(adventure);
        sort.add(horror);
        sort.add(mystery);
        sort.add(other);
        sort.add(highRating);
        sort.add(lowRating);
        menuBar.add(sort);

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
