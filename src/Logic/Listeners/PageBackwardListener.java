package Logic.Listeners;

import Layouts.BookList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the back page button
 */
public class PageBackwardListener implements ActionListener {
    private BookList bookList;

    /**
     * Constructor for the back page button listener that updates the list of 7 buttons
     * @param bookList the list that contains the buttons
     */
    public PageBackwardListener(BookList bookList) {
        this.bookList = bookList;
    }

    /**
     * Updates the buttons backwards
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int start = bookList.getStart() - 7;
        int last = bookList.getLast() - 7;
        bookList.updateButtons(start, last);
    }
}
