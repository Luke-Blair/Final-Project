package Logic;

import Layouts.BookList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageBackwardListener implements ActionListener {
    private BookList bookList;

    public PageBackwardListener(BookList bookList) {
        this.bookList = bookList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int start = bookList.getStart() - 7;
        int last = bookList.getLast() - 7;
        bookList.updateButtons(start, last);
    }
}
