package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookrepo=new BookRepository();
    public void searchByIsbn(String isbn) {
        System.out.printf("searching for book with ISBN is %s\n.", isbn);
        Book book = bookrepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.printf("0 book found");
        }
        System.out.print("\n\n");
    }
        public void searchByTitle(String keyword){
            System.out.printf("searching for books with '%s' in the title---\n",keyword);
            ArrayList<Book> books=bookrepo.findByTitle(keyword);
            System.out.printf("%s books found%s\n",books.size(),books.size()>0?":":".");
            for(Book book : books){
                System.out.format("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",book.getTitle(),book.getGenre(),book.getAuthor());
            }
            System.out.println();
        }
        public void checkOutBook(String isbn){
        Book book=bookrepo.findByIsbn(isbn);
        if(book != null){
            if(book.checkOut()){
                System.out.println("Check out SUCCESSFUL: ");
                System.out.format("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(),book.getTitle(),book.getAuthor());
            }
            else{
                System.out.println("Check out FAILED: ");
                System.out.format("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(),book.getTitle(),book.getAuthor());
                System.out.println("Reason: More books checked out than recorded quantity.");
            }
        }
        else{
            System.out.printf("Failed to check out book.\n");
            System.out.printf("Reason: There is no book with ISBN %s is on record.\n",isbn);
        }
        }
    public void checkInBook(String isbn){
        Book book=bookrepo.findByIsbn(isbn);
        if(book != null){
            book.checkIn();
            System.out.println("Book checked in successfully:");
            System.out.format("\tISBN: %s\n\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getIsbn(),book.getTitle(),book.getAuthor());
        }
        else{
            System.out.printf("Failed to check in book.\n");
            System.out.printf("Reason: There is no book with ISBN %s is on record.\n",isbn);
        }
    }
       }



