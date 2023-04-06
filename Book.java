import java.time.LocalDate;
public class Book {
    private LocalDate last;
    public static class Builder{
        private String name;
        private Rating rating = Rating.None;
        private Genre genre = Genre.Other;
        private String author = "Unkown";
        public Builder(String name){
            this.name = name;
        }
        public Builder rating(String r){
            rating = Rating.valueOf(r);
            return this;
        }
        public Builder genre(String g){
            genre = Genre.valueOf(g);
            return this;
        }
        public Builder author(String a){
            author = a;
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
    private Book(Builder builder){
        String name = builder.name;
        Rating rating = builder.rating;
        Genre genre = builder.genre;
        String author = builder.author;
    }
}
