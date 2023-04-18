package Layouts;

import javax.swing.*;
import java.awt.*;

public class PgFowardBack extends JPanel {
    public PgFowardBack(){
        GridLayout fbLayout = new GridLayout();
        fbLayout.setColumns(1);
        setLayout(fbLayout);
        JButton back = new JButton("<|pg:n");
        JButton foward = new JButton("pg:m|>");
        add(back);
        add(foward);;
    }

    @Override
    public Dimension getSize() {
        return new Dimension(60,10);
    }
}
