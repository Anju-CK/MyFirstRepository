package libapp;
import java.util.ArrayList;
public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository() {
        books.add(new Book("84214", "The Dead of Night", "Horror", "S.K.Eleton",10,7));
        books.add(new Book("25274", "Castles and Crenellations", "Historical", "H.P.Anderson",5,1));
        books.add(new Book("78423", "The Knight's Sword", "Fantasy", "F.E.Anvil",4,0));
        books.add(new Book("69512", "Night and Day", "Mystery", "Q.Z.Bizar",8,2));
        books.add(new Book("54281", "Castle Slege", "Historical", "N.N.Blacksmith",10,4));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}