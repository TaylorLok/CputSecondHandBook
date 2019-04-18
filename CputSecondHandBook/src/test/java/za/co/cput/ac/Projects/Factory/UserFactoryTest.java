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
        String name ="Taylor";
        String surname ="Lokombe";
        int studentNumber = 214291324;

        User user = UserFactory.getUser(name,surname,studentNumber);
        System.out.println(user);
        Assert.assertNotNull(((User) user).getName());

        //Assert.assertEquals("Taylor","lokombe");
    }
}