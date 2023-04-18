package Logic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JLabel;
public class ButtonListener implements ActionListener{
    private String name;
    private String author;
    private String genre;
    private LocalDate last;
    public ButtonListener(JLabel label, String name, String author, String genre, String last){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.last = LocalDate.parse(last);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new JLabel(name);
        new JLabel(author);
        new JLabel(genre);
        new JLabel(last.toString());
    }
}