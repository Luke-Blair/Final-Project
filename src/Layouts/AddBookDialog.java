package Layouts;

import javax.swing.*;
import java.awt.*;

public class AddBookDialog extends JDialog {
    private static AddBookDialog theInstance;

    private AddBookDialog() {
        add(new JLabel("Hi"));
    }

    public static synchronized AddBookDialog instance() {
        if (theInstance == null) {
            theInstance = new AddBookDialog();
        }
        return theInstance;
    }
}
