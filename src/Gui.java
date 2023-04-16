import Layouts.BookInfo;
import Layouts.BookList;
import Layouts.ParentLayout;
import Layouts.ProjectFrame;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Gui {

    private static Gui theInstance;
    final int RESULTS_PER_PAGE = 10;

    /**Singleton pattern for Gui object
     *
     * @return theInstance an instance of the Gui object
     */
    public static synchronized Gui instance(){
        if (theInstance == null){
            theInstance = new Gui();
        }
        return theInstance;
    }

    /**
     * Default constructor for the Gui object
     *
     * @returns Gui a Gui object
     */
    private Gui(){


    }

    /**
     * Constructs a JFrame object inside of the Gui, the method then loads the
     * parts required to construct the visual graphics of our project.
     */
    public void build(){
        JFrame frame = new ProjectFrame("Book-Byte");

        //Panel used to hold all other pannels
        JPanel parentPanel = new ParentLayout();

        //Panel used to display selectedBook's info
        JPanel infoPanel = new BookInfo();

        //Panel used to hold all selectable books
         JPanel bookPanel = new BookList();


        //Buttons representing books in bookPane
        //Labels representing book info
        // TODO remove from final code
        packSampleButtons(bookPanel);
        packSampleLabels(infoPanel);

        //adding child panel to parent panel
        parentPanel.add(infoPanel);
        parentPanel.add(bookPanel);

        frame.add(parentPanel);

        frame.pack();
        frame.setSize(900, 700);
        frame.setVisible(true);


    }


    // TODO remove all refrences to this method in final code
    private void packSampleButtons(JPanel pane){
        for(int i = 0; i < RESULTS_PER_PAGE; i++ ){
            JButton button = new JButton((i + 1) + "# Sample Button");
            button.setMinimumSize(new Dimension(10, 10));
            pane.add(button);
        }
        JPanel fbPanel = new JPanel();
        GridLayout fbLayout = new GridLayout();
        fbLayout.setColumns(1);
        fbPanel.setLayout(fbLayout);
        fbPanel.add(new JButton("<|pg:n"));
        fbPanel.add(new JButton("pg:m|>"));
        pane.add(fbPanel);

    }

    // TODO remove all refrences to this method in final code
    private void packSampleLabels(JPanel pane){
        for(int i = 0; i < 4; i++ ){
            pane.add(new JLabel((i + 1) + "# Sample Label "));
        }
    }

}
