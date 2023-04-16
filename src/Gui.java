import javax.swing.*;
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
        JFrame frame = new JFrame("Book-Byte");
        Container content = frame.getContentPane();



        //Set operation on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel parentPanel = new JPanel();
        parentPanelLayoutConfigs(parentPanel);

        //Pane used to display selectedBook's info
        JPanel infoPanel = new JPanel();
        infoPanelLayoutConfigs(infoPanel);
        packSampleLabels(infoPanel);

        //Pane used to hold all selectable books
        JPanel bookPanel = new JPanel();
        bookPanelLayoutConfigs(bookPanel);

        //Buttons representing books in bookPane
        // TODO remove from final code
        packSampleButtons(bookPanel);

        parentPanel.add(infoPanel);
        parentPanel.add(bookPanel);

        frame.add(parentPanel);


        frame.pack();
        frame.setVisible(true);


    }

    /**
     * This Method sets a JPanel assigned as bookPane to the proper configurations
     * @param parentPane
     */
    private void parentPanelLayoutConfigs(JPanel parentPane){
        int columns = 1;
        int rows = 4;
        GridLayout layout = new GridLayout();
        layout.setColumns(columns);
        layout.setRows(rows);
        parentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        parentPane.setLayout(layout);
    }

    /**
     * This Method sets a JPanel assigned as bookPane to the proper configurations
     * @param bookPane
     */
    private void bookPanelLayoutConfigs(JPanel bookPane){
        int columns = 1;
        int rows = RESULTS_PER_PAGE;
        GridLayout layout = new GridLayout();
        layout.setColumns(columns);
        layout.setRows(rows);
        bookPane.setLayout(layout);
    }


    /**
     * This Method sets a JPanel assigned as bookPane to the proper configurations
     * @param infoPane
     */
    private void infoPanelLayoutConfigs(JPanel infoPane){
        int columns = 2;
        int rows = 2;
        Color backgroundColor = new Color(167, 168, 168);
        GridLayout layout = new GridLayout();
        infoPane.setBackground(backgroundColor);
        layout.setColumns(columns);
        layout.setRows(rows);
        infoPane.setLayout(layout);
    }

    // TODO remove all refrences to this method in final code
    private void packSampleButtons(JPanel pane){
        for(int i = 0; i < RESULTS_PER_PAGE; i++ ){
            pane.add(new JButton((i + 1) + "# Sample Button"));
        }
    }

    // TODO remove all refrences to this method in final code
    private void packSampleLabels(JPanel pane){
        for(int i = 0; i < 4; i++ ){
            pane.add(new JLabel((i + 1) + "# Sample Label "));
        }
    }

}
