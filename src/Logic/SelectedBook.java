package Logic;

public class SelectedBook {
    private static SelectedBook theInstance;
    private Book book;
    public static synchronized SelectedBook instance() {
        if(theInstance == null) {
            theInstance = new SelectedBook(new Book.Builder("None")
                    .author("None")
                    .genre("Other")
                    .rating(0)
                    .build());
        }
        return theInstance;
    }

    private SelectedBook(Book selectedBook) {
        book = selectedBook;
    }

    public void setBook(Book selectedBook) {
        book = selectedBook;
    }

    public Book getBook() {
        return book;
    }
}
