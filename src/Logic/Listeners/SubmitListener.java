package Logic.Listeners;

import Logic.Library.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitListener implements ActionListener {
    private static SubmitListener theInstance;
    private JTextField title;
    private JTextField author;
    private JComboBox genre;
    private JComboBox rating;

    private SubmitListener(JTextField title, JTextField author, JComboBox genre, JComboBox rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public static synchronized SubmitListener instance(JTextField title, JTextField author, JComboBox genre, JComboBox rating) {
        if (theInstance == null) {
            theInstance = new SubmitListener(title, author, genre, rating);
        }
        return theInstance;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String genre = (String)this.genre.getSelectedItem();
        int rating = this.genre.getSelectedIndex() + 1;
        String title = this.title.getText();
        String author = this.title.getText();



        Book book = new Book.Builder(title)
            .author(author)
            .genre(genre)
            .rating(rating)
            .build();

        Library lib = Library.instance();
        lib.addBook(book);
        lib.saveToFile();





    }
}
