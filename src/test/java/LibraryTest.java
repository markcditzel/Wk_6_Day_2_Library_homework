import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest { // OPEN CLASS

    // SETUP
    private Library library;
    private Book book;

    @Before
    public void before(){ // OPEN BEFORE
        library = new Library ("Alexandria", 3);
        book = new Book ("Heart of Darkness", "Joseph Conrad", Genre.FICTION);
    } // CLOSE BEFORE

    @Test
    public void libraryHasName(){ // OPEN TEST = PASS
        assertEquals("Alexandria", library.getName());
    } //CLOSE TEST

    @Test
    public void libraryIsEmptyAtInstantiation(){ // OPEN TEST = PASS
        assertEquals(0, library.getBookCount());
    } // CLOSE TEST

    @Test
    public void addBookToLibrary(){ // = PASS
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    // try to add four books to the library, but should only be allowed to add three
    public void addBookToLibrary2(){ // = PASS

        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }

} // CLOSE CLASS
