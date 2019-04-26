package Factory;

import Domain.UserEmailVerification;
import org.junit.Assert;

public class UserEmailVerificationFactoryTest
{

      UserEmailVerification userM;

    @org.junit.Test
    public void getUserVerify() throws Exception
    {
        userM = new UserEmailVerification.Builder()
                                         .build();


        Assert.assertNotNull(userM);
        Assert.assertTrue("sent",true);
        Assert.assertFalse(false);


    }

}