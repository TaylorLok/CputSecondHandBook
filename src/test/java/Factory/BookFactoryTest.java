package Factory;

import com.cput.ac.org.domain.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookFactoryTest
{

   Book book;

    @Test(expected = AssertionError.class)
    public void getBook()
    {
      book = new Book.Builder()
                     .bookTitle("Alchemist")
                     .bookLanguage("English")
                     .publicationDate("25/02/1998")
                     .publisher("universal book")
                     .bookDescription("alchnist is one of the best book, talks about the journey")
                     .bookPrice(200.00)
                     .build();

        Assert.assertNotNull(book);
        Assert.assertEquals("alchnist is one of the best book, talks about the journey", book.getBookDescription());
        Assert.assertEquals("Alchemist", book.getBookTitle());
        Assert.assertEquals("English", book.getBookLanguage());
        Assert.assertEquals("25/02/1998", book.getPublicationDate());
       Assert.assertEquals("200.00", book.getBookPrice());
        Assert.assertNotNull(book.getPublisher());


    }
}