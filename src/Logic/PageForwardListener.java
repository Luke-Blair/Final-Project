package Logic;

import Layouts.BookList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageForwardListener implements ActionListener {
    private BookList bookList;

    public PageForwardListener(BookList bookList) {
        this.bookList = bookList;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int start = bookList.getStart() + 7;
        int last = bookList.getLast() + 7;
        bookList.updateButtons(start, last);
    }
}
