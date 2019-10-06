package repository;

import com.cput.ac.org.domain.Book;
import com.cput.ac.org.factory.BookFactory;
import com.cput.ac.org.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class BookRepositoryImplTest
{
    private BookRepository repository;
    private Book book;
  //  private BookByAuthor author;
    //private BookByCourse course;

    private Book savedBook()
    {
        Set<Book> bookMap = this.repository.getAll();
        return bookMap.iterator().next();

    }


    @Before
    public void setUp() throws Exception
    {
        repository = BookRepositoryImpl.getRepository();
        book = BookFactory.getNewBook("alchemist","love book",200.00,
                "paolo caelho","18/05/2019", "English");


    }

    @Test
    public void create()
    {
        assertEquals(repository.create(book),repository.create(book));
    }

    @Test
    public void read()
    {
        repository.read(book);
    }

    @Test
    public void delete()
    {
        repository.delete(book);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(book),repository.update(book));
    }


    @Test
    public void getAll()
    {
        Set<Book>books = this.repository.getAll();
        Assert.assertNotNull("Book",books.size());
    }
}