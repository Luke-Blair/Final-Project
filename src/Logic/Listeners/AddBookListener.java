package Logic.Listeners;


import Layouts.AddBookDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddBookListener implements ActionListener {
    private static AddBookListener theInstance;

    private AddBookListener(){
        super();
    }

    public static synchronized AddBookListener instance(){
        if(theInstance == null){
            theInstance = new AddBookListener();
        }
        return  theInstance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JDialog dialog = AddBookDialog.instance();
        System.out.println("Event Detected");
        dialog.setSize(new Dimension(600,400));
        dialog.setVisible(true);
    }
}
