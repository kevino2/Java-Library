import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;


    @Before
    public void setUp(){
        library = new Library(5);
        book1 = new Book("Great Expectations", "Charles Dickens", "Fiction");
        book2 = new Book("Misery", "Stephen King", "Fiction");
        book3 = new Book("Oliver", "Charles Dickens", "Fiction");
        book4 = new Book("Cooking With Cheese", "Charles Cheese", "Cook book");
        book5 = new Book("World War 2 in Colour", "Penguin", "History");
        book6 = new Book("How To Climb Trees", "Penguin", "Education");
    }

    @Test
      public void CanAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
      public void CantGoOverCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.countBooks());
    }

    @Test
      public void canRemoveFromCollection() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeFromCollection();
        assertEquals(1, library.countBooks());
    }







}
