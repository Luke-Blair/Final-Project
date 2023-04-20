package Layouts;

import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;

/**
 * Represents the frame of the project
 */
public class ProjectFrame extends JFrame {
    /**
     * Sets up the frame of the project
     * @param s the title of the program
     */
    public ProjectFrame(String s){
        super(s);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
}
