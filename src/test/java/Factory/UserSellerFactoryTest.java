package Factory;

import Domain.UserSeller;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UserSellerFactoryTest
{

    UserSeller userSeller;


    @Test
    public void getUserSeller()
    {
      userSeller = new UserSeller.Builder()
                                 .bookTitle("Biology")
                                 .bookDesc("Talk about human")
                                 .price(200)
                                 .advertDate("28/12/1987")
                                 .expireDate("04/01/1998")
                                 .build();

        Assert.assertNotNull(userSeller);
        Assert.assertEquals("Biology",userSeller.getBookTitle());
        Assert.assertEquals("Talk about human",userSeller.getBookDesc());
        Assert.assertEquals(200,userSeller.getPrice());
        Assert.assertEquals("28/12/1987",userSeller.getAdvertDate());
        Assert.assertEquals("04/01/1998",userSeller.getExpireDate());
    }
}