package Layouts;

import Logic.Book;
import Logic.Library;
import Logic.SelectedBook;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BookInfo extends JPanel {
    private JLabel name;
    private JLabel author;
    private JLabel genre;
    private JLabel rating;
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

    public void setLabels(SelectedBook book) {
        Book b = book.getBook();
        name.setText("Name: " + b.getName());
        author.setText("Author: " + b.getAuthor());
        genre.setText("Genre: " + String.valueOf(b.getGenre()));
        rating.setText("Rating: " + String.valueOf(b.getRating()));
    }
}
