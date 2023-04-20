package Logic.Listeners;


import Layouts.BookList;
import Logic.Library.Library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RatingListener implements ActionListener {
    private boolean lowToHigh;
    private BookList bookList;

    public RatingListener(boolean lowToHigh, BookList bookList) {
        this.lowToHigh = lowToHigh;
        this.bookList = bookList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Library lib = Library.instance();
        lib.sortByRating(lowToHigh);
        bookList.updateButtons(0, 7);
    }
}
