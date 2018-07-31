import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book ("The Bible", "The apostles", Genre.FICTION);
    }

    @Test // DOES THE BOOK HAVE AN AUTHOR? = PASS
    public void doesBookhaveAuthor(){ // OPEN
        assertEquals("The apostles", book.getAuthor());
    } // CLOSE

    @Test // DOES BOOK HAVE A TITLE
    public void doesBookhaveTitle(){ //OPEN = PASS
        assertEquals("The Bible", book.getTitle());
        } // CLOSE

    @Test // DOES BOOK HAVE A GENRE = PASS
    public void doesBookHaveGenre(){
    assertEquals(Genre.FICTION, book.getGenre());
    }

    @Test // DOES BOOK HAVE A GENRE-ASSOCIATED DESCRIPTION? = PASS
    public void doesBookHaveGenreDescription(){
        assertEquals("Made up stuff", book.getBookGenreDescription());
    }
}
