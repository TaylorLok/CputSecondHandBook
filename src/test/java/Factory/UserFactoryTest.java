package Factory;

import com.cput.ac.org.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserFactoryTest {

    User user;

    @Before
    public void setUp() throws Exception
    {
         user = new User.Builder()
                         .name("name")
                         .surname("Surname")
                         .studentNumber("studentNumber")
                           .telNumber("telNumber")
                         .build();


    }


    @Test
    public void getUser()
    {
      user = new User.Builder()
              .name("Taylor")
              .surname("Lokombe")
              .studentNumber("214291324")
              .telNumber("0780140396")
              .build();




        Assert.assertNotNull(user);
        Assert.assertEquals("Taylor", user.getName());
        Assert.assertEquals("Lokombe",user.getSurname());
        Assert.assertEquals("214291324",user.getStudentNumber());
        Assert.assertEquals("0780140396",user.getTelNumber());

        System.out.println(toString());
    }
}