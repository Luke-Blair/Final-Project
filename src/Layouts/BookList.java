package Layouts;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import Logic.*;




public class BookList extends JPanel {
    private BookInfo info;
    public BookList(BookInfo info){

        this.info = info;
        GridLayout layout = new GridLayout(0, 1);
        setBorder(new LineBorder(new Color(0x636372), 5));
        setLayout(layout);
        Color backgroundColor = new Color(255, 0, 0);
        setBackground(backgroundColor);
        JLabel selectedBook = new JLabel("Please select a book:");
        selectedBook.setBorder(new EmptyBorder(20,40,20,20));
        add(selectedBook);
        packSampleButtons();
    }

    private void packSampleButtons(){
        Library lib = Library.instance();
        for(int i = 0; i < 7; i++ ){
            try {
                Book book = lib.getList().get(i);
                String author = book.getAuthor();
                String title = book.getName();
                String buttonString = String.format("Title: %-100s Author: %-100s", title, author);
                JButton button = new JButton(buttonString);
                button.setPreferredSize(new Dimension(5, 50));
                button.addActionListener(new ButtonListener(info, title, author, String.valueOf(book.getGenre()), String.valueOf(book.getRating())));
                add(button);
            }catch(Exception e){
                add(new JButton());

            }
        }

    }
}

