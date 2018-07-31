import java.util.ArrayList;
import java.util.HashMap;

public class Library { // OPEN CLASS

    // PROPERTIES
    // Define Class properties / instance variables
    // Ensure that the variable type is defined before naming the instance variable
    private String name; // each Library object will have a name
    private int capacity; // each Library object will have a max capacity
    private ArrayList<Book> books; // Each Library will be capable of holding an array of book objects

    // CONSTRUCTOR METHOD

    // Constructor has parameters to define Library object name (String) and capacity (int)
    // Each Library object starts with an empty array of books
    public Library(String name, int capacity){ // OPEN Constructor
        this.name = name; // Library name
        this.capacity = capacity; // Library capacity
        this.books = new ArrayList<>(); // Library books - begins as an empty ArrayList
    } // Close Constructor

    // METHODS

    // METHOD - GETTER the library name
    // RETURNS a String - library name
    public String getName() { // OPEN METHOD
        return this.name;
    } // CLOSE METHOD

    //METHOD - Count number of books in the books array
    //RETURNS an int of books contents
    public int getBookCount(){ // OPEN METHOD
        return this.books.size();
    } // CLOSE METHOD

    //METHOD - Add a book to the library
    // Provide a book (Book book) object as an argument into the method
    // NO RETURN
    // Check to see if there is capacity in the library to fit in book
    // Internal reference to the capacityCheck method  as a conditional statement
    public void addBook(Book book) { // OPEN METHOD
        if (capacityCheck()) { // OPEN BLOCK
            this.books.add(book);
        } // CLOSE BLOCK
    } // CLOSE METHOD


    //METHOD - determine if there is spare capacity in the library
    // RETURNS Boolean
    // check if the current book array count is less than the library capacity
    // TRUE = there is capacity to accept books
    // FALSE = there is NO spare capacity to accept books
    public boolean capacityCheck(){ // OPEN METHOD
        return this.books.size() < this.capacity;
    } // CLOSE METHOD


} // CLOSE Class



