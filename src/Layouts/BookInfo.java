package Layouts;

import Logic.Library.Book;
import Logic.Library.SelectedBook;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * BookInfo class which contains the panels of book information when a book is clicked on
 */
public class BookInfo extends JPanel {
    private JLabel name;
    private JLabel author;
    private JLabel genre;
    private JLabel rating;

    /**
     * Constructor for BookInfo, sets the layout and calls methods to include the first 7 books
     * onto the buttons
     */
    public BookInfo(){
        int columns = 2;
        int rows = 2;
        setPreferredSize(new Dimension(20,100));
        Color backgroundColor = new Color(167, 168, 168);
        setBorder(new LineBorder(new Color(0x636372), 5));
        GridLayout layout = new GridLayout();
        setBackground(backgroundColor);
        layout.setColumns(columns);
        layout.setRows(rows);
        setLayout(layout);
        sampleText();
    }

    /**
     * Creates empty panel for book information (useful on very start of program)
     */
    private void sampleText(){
        SelectedBook selectedBook = SelectedBook.instance();
        Book book = selectedBook.getBook();

        name = new JLabel("Name: ");
        name.setBorder(new EmptyBorder(20,40,20, 20));

        author = new JLabel("Author: ");

        genre = new JLabel("Genre: ");
        genre.setBorder(new EmptyBorder(20,40,20, 20));

        rating = new JLabel("Rating: ");


        add(name);
        add(author);
        add(genre);
        add(rating);
    }

    /**
     * Updates information for the current book that was clicked on
     * @param book the book button that was clicked on
     */
    public void setLabels(SelectedBook book) {
        Book b = book.getBook();
        name.setText("Name: " + b.getName());
        author.setText("Author: " + b.getAuthor());
        genre.setText("Genre: " + String.valueOf(b.getGenre()));
        rating.setText("Rating: " + String.valueOf(b.getRating()));
    }
}
