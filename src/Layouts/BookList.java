package Layouts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BookList extends JPanel {
    public BookList(){

        GridLayout layout = new GridLayout(0, 1);
        setLayout(layout);
        setBorder(new EmptyBorder(0,0,20,0));
        Color backgroundColor = new Color(255, 0, 0);
        setBackground(backgroundColor);
        add(new JLabel("Please select a book:"));
        packSampleButtons();
    }

    private void packSampleButtons(){
        for(int i = 0; i < 7; i++ ){
            JButton button = new JButton((i + 1) + "# Sample Button");
            button.setPreferredSize(new Dimension(5,50));
            add(button);
        }

    }
}

