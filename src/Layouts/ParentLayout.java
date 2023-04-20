package Layouts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Represents the parent layout for the project
 */
public class ParentLayout extends JPanel {
    /**
     * Constructs the parent layout for the project
     */
    public ParentLayout(){
        setBorder(new EmptyBorder(10,100,10, 100));
        setMaximumSize(new Dimension(700,0));
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

    }
}
