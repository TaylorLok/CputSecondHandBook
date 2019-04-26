package Factory;

import Domain.BookByDepartment;
import org.junit.Assert;
import org.junit.Test;

public class BookByDepartmentFactoryTest
{

  BookByDepartment bookdpt;

    @Test
    public void getInstance()
    {
        bookdpt = new BookByDepartment.Builder()
                                      .dptOfAppliedScience("information Design book")
                                      .dptOfBusiness("management book")
                                      .dptOfEducation("English Book for Teaching")
                                      .dptOfEngineering("How to program book")
                                      .dptOfHealth("Anatomy of life book")
                                      .dptOfInformDesign("jewelery and design book ")
                                      .build();


        Assert.assertNotNull(bookdpt);
        Assert.assertEquals("Anatomy of life book",bookdpt.getDptOfHealth());
        Assert.assertEquals("information design book",bookdpt.getDptOfAppliedScience());
        Assert.assertEquals("English book for teaching",bookdpt.getDptOfEducation());
    }
}