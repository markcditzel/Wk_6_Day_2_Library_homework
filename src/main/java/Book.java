public class Book {

    //Instance variables = object instantiated with these properties
    private Genre genre;
    private String title;
    private String author;

    // Constructor - CAN take in arguments to define instance variables
    public Book(String title, String author, Genre genre) {//OPEN
        this.title = title;
        this.author = author;
        this.genre = genre;
    } //CLOSE

    // Author GETTER
    //RETURNS String
    public String getAuthor() {//OPEN
        return author;
    }//CLOSE

    // Title GETTER
    // RETURNS String
    public String getTitle() {
        return title;
    }

    // Genre GETTER
    //RETURNS Genre Symbol
    public Genre getGenre() {
        return genre;
    }

    // Description GETTER that communicates with Genre and requires writing getDescription in Genre class
    // RETURNS String
    public String getBookGenreDescription(){
        return this.genre.getDescription();
    }
}
