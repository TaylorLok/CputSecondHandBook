package Factory;

import com.cput.ac.org.Domain.BookByAuthor;
import com.cput.ac.org.Factory.BookByAuthorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookByAuthorFactoryTest
{
    private BookByAuthor author;


    @Before
    public void setUp() throws Exception
    {
        author = BookByAuthorFactory.getAuthor("vince","he was born in South Africa");
    }

    @Test
    public void getAuthor()
    {
        Assert.assertEquals("vince",author.getName());
        Assert.assertEquals("he was born in South Africa",author.getBio());
    }
}