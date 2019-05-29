import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void setup() {
        borrower = new Borrower();
        library = new Library(5);
        book1 = new Book("Great Expectations", "Charles Dickens", "Fiction");
        book2 = new Book("Misery", "Stephen King", "Fiction");
        book3 = new Book("Oliver", "Charles Dickens", "Fiction");
        book4 = new Book("Cooking With Cheese", "Charles Cheese", "Cook book");
        book5 = new Book("World War 2 in Colour", "Penguin", "History");
        book6 = new Book("How To Climb Trees", "Penguin", "Education");
    }

    @Test
    public void CanRentBook() {
        library.addBook(book1);
        borrower.rentBook(library, book1);
        assertEquals(1, borrower.countRentals());
        assertEquals(4, library.countBooks());
    }


    }

