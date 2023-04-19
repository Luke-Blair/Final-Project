package Layouts;

import Logic.PageBackwardListener;
import Logic.PageForwardListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Represents the Forward and Backward buttons
 */
public class PgFowardBack extends JPanel {
    /**
     * Constructor for PgForwardBack that creates 2 buttons and assigns them to
     * forward and backward
     * @param bookList the list of buttons that the page buttons will update
     */
    public PgFowardBack(BookList bookList) {
        setPreferredSize(new Dimension(20,30));
        setBackground(new Color(0x0000FA));
        GridLayout fbLayout = new GridLayout();
        setBorder(new LineBorder(new Color(0x636372), 5));
        setLayout(fbLayout);
        setSize(new Dimension(20, 20));
        JButton back = new JButton("Previous");
        JButton foward = new JButton("Next");
        foward.addActionListener(new PageForwardListener(bookList));
        back.addActionListener(new PageBackwardListener(bookList));
        add(back);
        add(foward);

    }
}

