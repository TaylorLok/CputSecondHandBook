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
        shortCourse = ShortCourseFactory.getShortCourseBooks("ccna1","ccna2","ccnp","cyber");



        Assert.assertEquals("ccna1",shortCourse.getCcna1());
        Assert.assertEquals("ccnp",shortCourse.getCcnp());
      Assert.assertEquals("ccna2",shortCourse.getCcna2());
        Assert.assertEquals("cyber",shortCourse.getCyberSecurity());


    }
}