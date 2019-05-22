package Factory;

import com.cput.ac.org.Domain.BookByCourse;
import org.junit.Assert;
import org.junit.Test;

public class BookByCourseFactoryTest
{
   BookByCourse book;
    @Test
    public void getBookbyCouse()
    {
        book = new BookByCourse.Builder()
                       .informationTech("IT")
                       .commerce()
                       .management()
                       .marketing()
                       .projectManagement()
                       .build();

        Assert.assertNotNull(book);
        Assert.assertEquals("IT",book.getInformationTech());

        Assert.assertEquals(book.getCommerce(),book.getCommerce());
        Assert.assertEquals(book.getInformationTech(),book.getInformationTech());

    }
}