package Factory;

import Domain.UserRegistration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationFactoryTest {

    UserRegistration userReg;

    @After
    public void tearDown() throws Exception
    {
        userReg = new UserRegistration.Builder()
                                      .build();
    }

    @Test
    public void getUserRegistration()
    {
        userReg = new UserRegistration.Builder()
                                      .name("Bintu")
                                      .surname("Ngoune")
                                      .studentNumber("214291324")
                                      .emailAddress("tabaro@cput.ac.za")
                                      .password("bintu002")
                                      .build();


        Assert.assertNotNull(userReg);
        Assert.assertEquals("Bintu",userReg.getName());
        Assert.assertEquals("Ngoune",userReg.getSurname());
        Assert.assertEquals("214291324",userReg.getStudentNumber());
        Assert.assertEquals("tabaro@cput.ac.za",userReg.getEmailAddress());
        Assert.assertEquals("bintu002",userReg.getPassword());
    }
}