package Logic;
import Layouts.BookInfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

public class ButtonListener implements ActionListener{
    private BookInfo info;
    private Book book;
    public ButtonListener(BookInfo info, Book b){
        this.info = info;
        this.book = b;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        SelectedBook selectedBook = SelectedBook.instance();
        selectedBook.setBook(book);
        info.setLabels(selectedBook);
    }
}