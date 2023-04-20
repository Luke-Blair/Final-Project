package Logic;

import Layouts.BookList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenreListener implements ActionListener {
    private String genre;
    private BookList bookList;
    public GenreListener(String genre, BookList bookList) {
        this.genre = genre;
        this.bookList = bookList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Library lib = Library.instance();
        lib.sortByGenre(Genre.valueOf(genre));
        bookList.updateButtons(0, 7);
    }
}
