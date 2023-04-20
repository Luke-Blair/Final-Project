package Logic.Listeners;
import Layouts.BookInfo;
import Logic.Library.Book;
import Logic.Library.SelectedBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents an ActionListener for the buttons that have book information
 */
public class ButtonListener implements ActionListener{
    private BookInfo info;
    private Book book;

    /**
     * Constructor for a ButtonListener that gives a "Book Button" its power
     * @param info the panel that is updated with book information
     * @param b the book that the listener represents
     */
    public ButtonListener(BookInfo info, Book b){
        this.info = info;
        this.book = b;
    }

    /**
     * Sets the display panel to its book object it contains by
     * updating the Singleton Case Class of SelectedBook
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        SelectedBook selectedBook = SelectedBook.instance();
        selectedBook.setBook(book);
        info.setLabels(selectedBook);
    }
}