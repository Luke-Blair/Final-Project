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
    private Book selectedBook;
    public BookInfo(Book selectedBook){
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

        JLabel l1 = new JLabel("Name:" + book.getName());
        l1.setBorder(new EmptyBorder(20,40,20, 20));

        JLabel l2 = new JLabel("Author:" + book.getAuthor());

        JLabel l3 = new JLabel("Genre:" + book.getGenre());
        l3.setBorder(new EmptyBorder(20,40,20, 20));

        JLabel l4 = new JLabel("Rating:" + book.getRating());


        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
}
