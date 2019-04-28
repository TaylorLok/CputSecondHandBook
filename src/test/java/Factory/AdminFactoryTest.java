package Factory;

import Domain.Admin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdminFactoryTest
{
    Admin admn;

    @Before
    public void setUp() throws Exception
    {

    }



    @Test
    public void getAdmin()
    {
        admn = new Admin.Builder()
                        .permission("granted")
                        .build();
        Assert.assertNotNull(admn);
        Assert.assertEquals("granted",admn.getPermission());
       // Assert.assertEquals("granted",admn.toString());




    }
}