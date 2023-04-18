package Layouts;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BookInfo extends JPanel {
    public BookInfo(){
        int columns = 2;
        int rows = 2;
        Color backgroundColor = new Color(167, 168, 168);
        GridLayout layout = new GridLayout();
        setBackground(backgroundColor);
        layout.setColumns(columns);
        layout.setRows(rows);
        setLayout(layout);
        sampleText();
    }

    private void sampleText(){
        add(new JLabel("Name:"));
        add(new JLabel("Author:"));
        add(new JLabel("Logic.Genre:"));
        add(new JLabel("Last Read"));
    }
}
