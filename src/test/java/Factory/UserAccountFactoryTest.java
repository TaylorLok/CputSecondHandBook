package Factory;

import com.cput.ac.org.domain.UserAccount;
import org.junit.Assert;
import org.junit.Test;

public class UserAccountFactoryTest
{
UserAccount userAccount;

    @Test
    public void getUserAccount()
    {
        userAccount = new UserAccount.Builder()
                                     .getCreationDate("28/12/2231")
                                      .getStatus("Active")
                                     .build();


        Assert.assertNotNull(userAccount);
        Assert.assertEquals("28/12/2231",userAccount.getCreationDate());
        Assert.assertEquals("Active",userAccount.getStatus());


        System.out.println(userAccount.toString());
    }


}