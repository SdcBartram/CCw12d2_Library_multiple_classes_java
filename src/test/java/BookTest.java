import com.codeclan.example.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Emma", "Jane Austen", "Romance");
    }

    @Test
    public void hasTitle(){
        assertEquals("Emma", book.getTitle());
    }
 @Test
    public void hasAuthor(){
        assertEquals("Jane Austen", book.getAuthor());
    }
 @Test
    public void hasGenre(){
        assertEquals("Romance", book.getGenre());
    }
}
