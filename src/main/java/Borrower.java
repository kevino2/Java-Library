import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> rentedBooks;


    public Borrower() {
        this.rentedBooks = new ArrayList<Book>();

}

    public void rentBook(Library library, Book book) {
            library.addBook(book);
            Book borrowedBook = library.removeFromCollection();
            this.rentedBooks.add(borrowedBook);
        }


    public int countRentals () {
        return this.rentedBooks.size();
    }

    }




