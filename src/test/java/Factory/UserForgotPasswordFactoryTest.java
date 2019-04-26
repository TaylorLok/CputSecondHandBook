package Factory;

import Domain.UserForgotPassword;
import org.junit.Assert;
import org.junit.Test;

public class UserForgotPasswordFactoryTest
{
    UserForgotPassword userPass;

    @Test
    public void getUserPassword()
    {
        userPass = new UserForgotPassword.Builder()
                                         .secretQuestion("name of your Hero?")
                                         .secretAnswer("Jesus")
                                         .build();


        Assert.assertNotNull(userPass);
        Assert.assertEquals("name of your Hero?",userPass.getSecretQuestion());
        Assert.assertEquals("Jesus",userPass.getSecretAnswer());
        Assert.assertFalse("question",false);
    }
}