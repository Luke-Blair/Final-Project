package Logic.Listeners;


import Layouts.BookList;
import Logic.Library.Library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents an ActionListener for the sorting the books by rating
 */
public class RatingListener implements ActionListener {
    private boolean lowToHigh;
    private BookList bookList;

    /**
     * Constructor for RatingListener that takes in whether user
     * wants list to be least to greatest or greatest to least
     * @param lowToHigh the specified order to sort
     * @param bookList the buttons that will be updated
     */
    public RatingListener(boolean lowToHigh, BookList bookList) {
        this.lowToHigh = lowToHigh;
        this.bookList = bookList;
    }

    /**
     * Sorts the books by either increasing or decreasing order
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Library lib = Library.instance();
        lib.sortByRating(lowToHigh);
        if(lib.getList().size() < 7) {
            bookList.updateButtons(0, lib.getList().size());
        } else {
            bookList.updateButtons(0, 7);
        }
    }
}
