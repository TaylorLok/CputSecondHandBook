package za.co.cput.ac.Projects.UserFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.co.cput.ac.Projects.Userdomain.User;

public class UserFactoryTest {

    @Before
    public void setUp() throws Exception
    {
        String name = "Taylor";
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