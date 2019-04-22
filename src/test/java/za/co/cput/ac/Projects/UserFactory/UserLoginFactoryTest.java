package Factory;

import Domain.UserLogin;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginFactoryTest
{

    private  UserLogin login;

    @Before
    public void setUp() throws Exception
    {
        login = UserLoginFactory.createLogin("taylor@cput.com","()mmYHll&*");
    }


    @Test
    public void createLogin()
    {
        Assert.assertEquals(UserLogin.getPassword(),UserLogin.getPassword());
    }
}