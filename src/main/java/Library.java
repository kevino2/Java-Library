import java.util.ArrayList;

public class Library {

    private ArrayList<Book>stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = 5;
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity) {
            this.stock.add(book);
        }
    }

    public int countBooks () {
            return this.stock.size();
    }

    public Book removeFromCollection() {
        Book borrowedBook = null;
        if(this.countBooks() > 0) {
            borrowedBook = this.stock.remove(0);
        }
        return borrowedBook;
    }


}
