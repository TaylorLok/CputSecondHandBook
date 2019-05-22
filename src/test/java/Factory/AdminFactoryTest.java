package Factory;

import com.cput.ac.org.Domain.Admin;
import org.junit.Assert;
import org.junit.Test;

public class AdminFactoryTest
{
    Admin admn;



    @Test
    public void getAdmin()
    {
        admn = new Admin.Builder()
                        .permission("granted")
                        .build();
        Assert.assertNotNull(admn);
        Assert.assertEquals("granted",admn.getPermission());





    }
}