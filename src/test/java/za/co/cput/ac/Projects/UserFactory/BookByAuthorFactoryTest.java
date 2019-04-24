package Factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookByAuthorFactoryTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getBook()
    {
       BookByAuthorFactory bookAuthor = new BookByAuthorFactory()
       {
           public String getName()
           {
               return null;
           }

           public String getBio()
           {
               return null;
           }
       };

    }
}