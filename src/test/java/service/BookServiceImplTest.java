package service;

import com.cput.ac.org.domain.Book;
import com.cput.ac.org.factory.BookFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.BookRepositoryImpl;

public class BookServiceImplTest {

    private BookRepositoryImpl repository;
    private Book books;

    @Before
    public void setUp() throws Exception
    {
        repository = BookRepositoryImpl.getRepository();
        books = BookFactory.getNewBook("born a crime","treovor noah story", (double) 200,"noah","18/05/2019","english");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(books),repository.create(books));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(books),repository.update(books));
    }

    @Test
    public void delete()
    {
        repository.delete(books);
    }

    @Test
    public void read()
    {
        repository.read(books);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}