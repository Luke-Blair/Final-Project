package Logic.Listeners;

import Layouts.BookList;
import Logic.Library.Genre;
import Logic.Library.Library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents an ActionListener for sorting the books by a specified genre
 */
public class GenreListener implements ActionListener {
    private String genre;
    private BookList bookList;

    /**
     * Constructor for GenreListener with specified genre and the list of books
     * @param genre the specified genre
     * @param bookList the book list that will be updated
     */
    public GenreListener(String genre, BookList bookList) {
        this.genre = genre;
        this.bookList = bookList;
    }

    /**
     * Sorts the books by the genre
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Library lib = Library.instance();
        lib.sortByGenre(Genre.valueOf(genre));
        bookList.updateButtons(0, 7);
    }
}
