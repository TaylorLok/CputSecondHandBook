package Factory;

import Domain.User.UserLogin;
import Factory.User.UserLoginFactory;
//import UserLogin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserLoginFactoryTest
{

    private UserLogin login;

    @Before
    public void setUp() throws Exception
    {
        login = UserLoginFactory.createLogin("taylor@cput.com","()mmYHll&*");
    }


    @Test
    public void createLogin()
    {
        //Assert.assertEquals(UserLogin.getPassword(), UserLogin.getPassword());
    }
}