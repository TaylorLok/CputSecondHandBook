package Factory;

import Domain.UserBuyer;
import org.junit.Assert;
import org.junit.Test;

public class UserBuyerFactoryTest
{
    UserBuyer useB = new UserBuyer.Builder()
                                  .build();

    @Test
    public void getBuyer()
    {
        Assert.assertNotNull(useB);
        Assert.fail("Book");
        Assert.assertEquals("search","title","title");
    }
}