package za.co.cput.ac.Projects.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUser()
    {
        Assert.assertEquals("Taylor","lokombe");
    }
}