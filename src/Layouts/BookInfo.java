package Layouts;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BookInfo extends JPanel {
    public BookInfo(){
        int columns = 2;
        int rows = 2;
        setPreferredSize(new Dimension(20,100));
        Color backgroundColor = new Color(167, 168, 168);
        setBorder(new LineBorder(new Color(0x636372), 5));
        GridLayout layout = new GridLayout();
        setBackground(backgroundColor);
        layout.setColumns(columns);
        layout.setRows(rows);
        setLayout(layout);
        sampleText();
    }

    private void sampleText(){
        JLabel l1 = new JLabel("Name:");
        l1.setBorder(new EmptyBorder(20,40,20, 20));

        JLabel l2 = new JLabel("Author:");

        JLabel l3 = new JLabel("Genre:");
        l3.setBorder(new EmptyBorder(20,40,20, 20));

        JLabel l4 = new JLabel("Last Read");


        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
}
