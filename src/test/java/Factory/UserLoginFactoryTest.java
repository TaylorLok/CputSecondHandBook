package Factory;

import com.cput.ac.org.domain.UserLogin;
//import UserLogin;
import com.cput.ac.org.factory.UserLoginFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserLoginFactoryTest
{

    private UserLogin login;

    @Before
    public void setUp() throws Exception
    {
        login = UserLoginFactory.createLogin("taylor@cput.com","Hummer9");
    }


    @Test
    public void createLogin()
    {
        Assert.assertNotNull(login);
        Assert.assertEquals("taylor@cput.com",login.getEmailAddress());
        Assert.assertEquals("Hummer9",login.getPassword());
    }
}