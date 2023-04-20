package Layouts;

import Logic.Listeners.SubmitListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class AddBookDialog extends JDialog {
    private static AddBookDialog theInstance;

    private AddBookDialog() {
        JPanel parentPanel = new JPanel();
        JPanel textBoxPanel = new JPanel();
        JPanel submitPanel = new JPanel();

        JLabel titleLabel = new JLabel("Title: ");
        JLabel authorLabel = new JLabel("Author: ");
        JLabel genreLabel = new JLabel("Genre: ");
        JLabel ratingLabel = new JLabel("Rating (x/10): ");

        String[] dropDownRating = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox rating = new JComboBox(dropDownRating);

        String[] dropDownGenre = {"Adventure", "Horror", "Mystery", "Other"};
        JComboBox genre = new JComboBox(dropDownGenre);



        JTextField title = new JTextField();
        JTextField author = new JTextField();


        title.setPreferredSize(new Dimension(100,20));
        author.setPreferredSize(new Dimension(100,20));
        genre.setPreferredSize(new Dimension(100,20));
        rating.setPreferredSize(new Dimension(100,20));


        textBoxPanel.add(titleLabel);
        textBoxPanel.add(title);
        textBoxPanel.add(authorLabel);
        textBoxPanel.add(author);
        textBoxPanel.add(genreLabel);
        textBoxPanel.add(genre);
        textBoxPanel.add(ratingLabel);
        textBoxPanel.add(rating);

        JButton submit = new JButton("Submit");
        submit.addActionListener(SubmitListener.instance(title, author, genre, rating));
        submitPanel.add(submit);





        parentPanel.add(textBoxPanel);
        parentPanel.add(submitPanel);
        add(parentPanel);

    }

    public static synchronized AddBookDialog instance() {
        if (theInstance == null) {
            theInstance = new AddBookDialog();
        }
        return theInstance;
    }
}
