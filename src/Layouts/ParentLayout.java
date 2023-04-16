package Layouts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ParentLayout extends JPanel {
    public ParentLayout(){
        setBorder(new EmptyBorder(10,100,10, 100));
        setMaximumSize(new Dimension(700,0));
        BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(layout);

    }
}
