package Factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUser()
    {
        String name ="Taylor";
        String surname ="Lokombe";
        String studentNumber = "214291324";
        String telNumber = "0780140396";

        //domainUser user = UserFactory.getUser(name,surname,studentNumber);
        System.out.println();
        //Assert.assertNotNull(((UserFactory.domainUser) user).getUser(name,surname,studentNumber,telNumber));

        //Assert.assertEquals("Taylor","lokombe");
    }
}