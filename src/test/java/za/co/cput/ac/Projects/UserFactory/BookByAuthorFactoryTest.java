package Factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
           @Override
           public String getName()
           {
               return null;
           }

           @Override
           public String getBio()
           {
               return null;
           }
       };

    }
}