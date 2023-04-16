package Layouts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BookList extends JPanel {
    public BookList(){

        GridLayout layout = new GridLayout(0, 1);
        setLayout(layout);
        setBorder(new EmptyBorder(20,0,20,0));
        Color backgroundColor = new Color(255, 0, 0);
        setBackground(backgroundColor);
    }
}

