package Layouts;

import javax.swing.*;
import java.awt.*;

public class PgFowardBack extends JPanel {
    public PgFowardBack(){
        GridLayout fbLayout = new GridLayout();
        fbLayout.setColumns(1);
        setLayout(fbLayout);
        add(new JButton("<|pg:n"));
        add(new JButton("pg:m|>"));;
    }
}
