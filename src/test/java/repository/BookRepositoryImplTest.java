package repository;

import Domain.Book;
import Factory.BookFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class BookRepositoryImplTest
{
    private BookRepository repository;
    private Book book;

    @Before
    public void setUp() throws Exception
    {
        repository = BookRepositoryImpl.getRepository();
        book = BookFactory.getInstance();
    }

    @Test
    public void getRepository()
    {

    }

    @Test
    public void create()
    {
        //Assert.assertNotNull(book);
        //Assert.assertEquals("Book",book.getBookTitle());
       Assert.assertEquals(repository.create(book),repository.create(book));
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