package Layouts;

import javax.swing.*;

public class ParentLayout extends JPanel {
    public ParentLayout(){
        BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        setLayout(layout);

    }
}
