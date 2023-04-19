package Layouts;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import Logic.*;




public class BookList extends JPanel {
    private BookInfo info;
    private int start;
    private int last;
    private HashMap<ButtonListener, JButton> buttonMap;
    private ArrayList<JButton> buttons;

    /**
     * Constructor for a BookList that dispalys book info from a specified start and end point
     * in the arraylist of books
     * @param info the panel that reads the book information
     * @param start the first specified index of the arraylist
     * @param last the last specified index of the arraylist
     */
    public BookList(BookInfo info, int start, int last){

        buttonMap = new HashMap<>();
        buttons = new ArrayList<>();
        this.start = start;
        this.last= last;
        this.info = info;
        GridLayout layout = new GridLayout(0, 1);
        setBorder(new LineBorder(new Color(0x636372), 5));
        setLayout(layout);
        Color backgroundColor = new Color(255, 0, 0);
        setBackground(backgroundColor);
        JLabel selectedBook = new JLabel("Please select a book:");
        selectedBook.setBorder(new EmptyBorder(20,40,20,20));
        add(selectedBook);
        packSampleButtons();
        updateButtons(0, 7);
    }

    /**
     * Creates 7 blank buttons
     */
    private void packSampleButtons(){
        Library lib = Library.instance();
        for(int i = 0; i < 7; i++ ){
            try {
                JButton button = new JButton("");
                buttons.add(button);
                button.setPreferredSize(new Dimension(5, 50));
                add(button);
            }catch(Exception e){
                add(new JButton());
            }
        }

    }

    /**
     * Updates the buttons display information to the specified start and end of the
     * arraylist of books
     * @param start the specified start index of the arraylist
     * @param last the specified end index of the arraylist
     */
    public void updateButtons(int start, int last) {
        Library lib = Library.instance();
        if(last > lib.getList().size()) {
            last = lib.getList().size();
        }
        if(last < 7) {
            last = 7;
        }
        if(start < 0) {
            start = 0;
        }
        if(start > lib.getList().size() - 7) {
            start = lib.getList().size() - 7;
        }

        // Update current start and end values of library
        this.start = start;
        this.last = last;

        // Remove all Action Listeners
        if(!buttonMap.isEmpty()) {
            for (ButtonListener listener : buttonMap.keySet()) {
                JButton button = buttonMap.get(listener);
                button.setText("");
                button.removeActionListener(listener);
            }
        }

        // Clear map
        buttonMap.clear();

        // Loop through and add keys and values to map, also assigns ButtonListeners to Buttons
        int curButton = 0;
        for(int i = start; i < last; i++) {
            Book book = lib.getList().get(i);
            String author = book.getAuthor();
            String title = book.getName();
            String buttonString = String.format("Title: %-100s Author: %-100s", title, author);
            ButtonListener buttonListener = new ButtonListener(info, book);
            JButton button = buttons.get(curButton);
            button.addActionListener(buttonListener);
            buttonMap.put(buttonListener, button);
            button.setText(buttonString);
            curButton++;
        }
    }

    /**
     * Returns the start index value
     * @return the start index value
     */
    public int getStart() {
        return start;
    }

    /**
     * Returns the end index value
     * @return the end index value
     */
    public int getLast() {
        return last;
    }
}

