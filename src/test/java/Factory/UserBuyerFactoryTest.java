package Factory;

import com.cput.ac.org.Domain.UserBuyer;
import com.cput.ac.org.Factory.UserBuyerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserBuyerFactoryTest
{
    private UserBuyer userBuyer;


    @Before
    public void setUp() throws Exception
    {
        userBuyer = UserBuyerFactory.getBuyer("taylor","Lokamba");
    }

    @Test
    public void getBuyer()
    {

        Assert.assertEquals("taylor",userBuyer.getName());
        Assert.assertEquals("Lokamba",userBuyer.getSurname());

    }
}