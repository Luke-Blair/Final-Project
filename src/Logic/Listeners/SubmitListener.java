package Logic.Listeners;
import Layouts.AddBookDialog;
import Logic.Library.Book;
import Logic.Library.Library;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this class is an ActionListener for the submit button on the JDialogBox created from the JItem "Add Book"
 */

public class SubmitListener implements ActionListener {
    private static SubmitListener theInstance;
    private JTextField title;
    private JTextField author;
    private JComboBox genre;
    private JComboBox rating;

    /**
     * This class is a default constructor
     *
     * @param title this represents the JTextField where the user inputs the book title
     * @param author this represents the JTextField where the user inputs the authors name
     * @param genre this represent the JComboBox where the options for genre are held
     * @param rating this represents the JComboBox where the options for rating are (1-10)
     *
     *
     */

    private SubmitListener(JTextField title, JTextField author, JComboBox genre, JComboBox rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    /**
     * this class is a singleton constructor for SubmitListener
     *
     * @param title this represents the JTextField where the user inputs the book title
     * @param author this represents the JTextField where the user inputs the authors name
     * @param genre this represent the JComboBox where the options for genre are held
     * @param rating this represents the JComboBox where the options for rating are (1-10)
     *
     * @return theInstance
     */

    public static synchronized SubmitListener instance(JTextField title, JTextField author, JComboBox genre, JComboBox rating) {
        if (theInstance == null) {
            theInstance = new SubmitListener(title, author, genre, rating);
        }
        return theInstance;
    }


    /**
     * This method grabs information from the JTextFields and the JComboBoxes and uses that information
     * to create Book objects which are saved to book.txt
     *
     * @param e this represents the action which triggers the method
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        String genre = (String)this.genre.getSelectedItem();
        int rating = this.rating.getSelectedIndex() + 1;
        String title = this.title.getText();
        String author = this.author.getText();

        this.title.setText("");
        this.author.setText("");
        this.genre.setSelectedIndex(0);
        this.rating.setSelectedIndex(0);

        AddBookDialog dialog = AddBookDialog.instance();
        dialog.confirmationVisible(true);


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
