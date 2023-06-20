import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    private Book book;

    @Before
    public void before(){
        book = new Book("Emma", "Jane Austen", "Romance");
        library = new Library();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cannotAddBooksOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.stockCount());
    }

}
