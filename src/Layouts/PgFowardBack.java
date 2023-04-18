package Layouts;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PgFowardBack extends JPanel {
    public PgFowardBack() {
        setPreferredSize(new Dimension(20,30));
        setBackground(new Color(0x0000FA));
        GridLayout fbLayout = new GridLayout();
        setBorder(new LineBorder(new Color(0x636372), 5));
        setLayout(fbLayout);
        setSize(new Dimension(20, 20));
        JButton back = new JButton("<|pg:n");
        JButton foward = new JButton("pg:m|>");
        add(back);
        add(foward);

    }
}

