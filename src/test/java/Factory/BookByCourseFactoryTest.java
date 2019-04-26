package Factory;

import Domain.BookByCourse;
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
        Assert.assertEquals("coomerce",book.getCommerce());
    }
}