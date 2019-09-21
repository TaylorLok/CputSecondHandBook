package Factory;

import com.cput.ac.org.domain.UserBuyer;
import com.cput.ac.org.factory.UserBuyerFactory;
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