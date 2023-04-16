package Layouts;

import javax.swing.*;
import java.awt.*;

public class BookList extends JPanel {
    public BookList(){
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        Color backgroundColor = new Color(255, 0, 0);
        setBackground(backgroundColor);
    }
}

