package Logic;

/**
 * Singleton Case that represents 1 book object, that being the one
 * clicked on
 */
public class SelectedBook {
    private static SelectedBook theInstance;
    private Book book;

    /**
     * Creates the 1 book object
     * @return the 1 SelectedBook object
     */
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

    /**
     * Private Constructor for Singleton Case
     * @param selectedBook the book that was clicked on
     */
    private SelectedBook(Book selectedBook) {
        book = selectedBook;
    }

    /**
     * Sets the SelectedBook to a new book
     * @param selectedBook the new book (book clicked on)
     */
    public void setBook(Book selectedBook) {
        book = selectedBook;
    }

    /**
     * Returns the 1 book object
     * @return the 1 book object
     */
    public Book getBook() {
        return book;
    }
}
