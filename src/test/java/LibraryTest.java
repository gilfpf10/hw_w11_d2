import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;


    @Before
    public void setup() {

        library = new Library("AdLib", 10);
        book1 = new Book("Book1", "author1", "drama");
        book2 = new Book("Book2","author2", "Drama");
        book3 = new Book("Book3", "author3","Drama");

    }

    @Test
    public void libraryHasName() {
        assertEquals("AdLib", library.getname());

    }


    @Test
    public void libraryHasBooks() {
        assertEquals(0, library.hasBooks());

    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.hasBooks());

    }
}

