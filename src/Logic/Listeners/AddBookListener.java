package Logic.Listeners;


import Layouts.AddBookDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this class is listener for the JMenuItem "Add Book". This class creates a dialog box to have the user
 * create a new book object for the program ot load in
 */
public class AddBookListener implements ActionListener {
    private static AddBookListener theInstance;

    /**
     * this is a default constructor which calls the parent class
     */

    private AddBookListener(){
        super();
    }

    /**
     * Singleton constructor
     *
     * @return the Instance
     */
    public static synchronized AddBookListener instance(){
        if(theInstance == null){
            theInstance = new AddBookListener();
        }
        return  theInstance;
    }


    /**
     * this method calls the AddBookDialog box, sets it's size, and sets it visible
     *
     * @param e this parameter is the event which activates this method
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog dialog = AddBookDialog.instance();
        dialog.setSize(new Dimension(705,125));
        dialog.setVisible(true);
    }
}
