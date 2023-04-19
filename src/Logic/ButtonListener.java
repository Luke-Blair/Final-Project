package Logic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JLabel;
public class ButtonListener implements ActionListener{
    private String name;
    private String author;
    private String genre;
    private String rating;
    public ButtonListener(String name, String author, String genre, String rating){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        SelectedBook selectedBook = SelectedBook.instance();
        selectedBook.setBook(new Book.Builder(name)
                .author(author)
                .genre(genre)
                .rating(Integer.parseInt(rating))
                .build());
    }
}