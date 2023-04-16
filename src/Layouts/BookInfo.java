package Layouts;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BookInfo extends JPanel {
    public BookInfo(){
        int columns = 2;
        int rows = 2;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        setBorder(blackline);
        Color backgroundColor = new Color(167, 168, 168);
        GridLayout layout = new GridLayout();
        setBackground(backgroundColor);
        layout.setColumns(columns);
        layout.setRows(rows);
        setLayout(layout);
    }
}
