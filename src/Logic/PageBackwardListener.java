package Logic;

import Layouts.BookList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageBackwardListener implements ActionListener {
    private int start;
    private int last;
    private BookList bookList;

    public PageBackwardListener(BookList bookList) {
        this.bookList = bookList;
        start = bookList.getStart();
        last = bookList.getLast();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        start-= 7;
        last-= 7;
        bookList.updateButtons(start, last);
    }
}
