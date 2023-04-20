package Logic.MenuItems;

import Layouts.BookList;
import Logic.Listeners.GenreListener;
import Logic.Listeners.RatingListener;

import javax.swing.*;

public class SortMenu extends JMenu{
    private static SortMenu theInstance;


    private SortMenu(JPanel bookPanel){

        super("SortBy");

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

        add(adventure);
        add(horror);
        add(mystery);
        add(other);
        add(lowRating);
        add(highRating);


    }

    public static synchronized SortMenu instance(JPanel bookPanel){
        if(theInstance == null){
            theInstance =  new SortMenu(bookPanel);
        }
            return theInstance;
    }



}
