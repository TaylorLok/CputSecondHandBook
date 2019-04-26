package Factory;

import Domain.ShortCourse;
import org.junit.Assert;
import org.junit.Test;

public class ShortCourseFactoryTest
{
    ShortCourse shortCourse;

    @Test
    public void getShortCourse()
    {
        shortCourse = new ShortCourse.Builder()
                               .build();


        Assert.assertNotNull(shortCourse);
        Assert.assertEquals("CCNA",shortCourse.getCcna1());
        Assert.assertEquals("ccnp",shortCourse.getCcnp());
        Assert.assertEquals("ccn3",shortCourse.getCcna2());
        Assert.assertEquals("cybersecurity",shortCourse.getCyberSecurity());


    }
}