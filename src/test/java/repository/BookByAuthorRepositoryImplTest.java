package repository;

import com.cput.ac.org.Domain.BookByAuthor;
import com.cput.ac.org.Factory.BookByAuthorFactory;
import com.cput.ac.org.repository.BookByAuthorRepository;
import com.cput.ac.org.repository.BookByAuthorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookByAuthorRepositoryImplTest
{
    private BookByAuthorRepository repository;
    private BookByAuthor author;

    @Before
    public void setUp() throws Exception
    {
        repository = BookByAuthorRepositoryImpl.getRepository();
        author = BookByAuthorFactory.getAuthor("Vincent","he was born in Eastern Cape");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(author),repository.create(author));

    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(author),repository.read(author));
    }

    @Test
    public void delete()
    {
        repository.delete(author);
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(author),repository.update(author));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}