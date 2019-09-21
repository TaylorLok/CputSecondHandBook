package Factory;

import com.cput.ac.org.domain.UserSeller;
import org.junit.Assert;
import org.junit.Test;

public class UserSellerFactoryTest
{

    UserSeller userSeller;


    @Test
    public void getUserSeller()
    {
      userSeller = new UserSeller.Builder()
                                 .name("taylor")
                                 .surname("Lokombe")
                                 .studentNumber("214291324")
                                 .telNumber("0780140396")
                                 .bookTitle("Biology")
                                 .bookDesc("Talk about human")
                                 .price(200)
                                 .advertDate("28/12/1987")
                                 .expireDate("04/01/1998")
                                 .build();

        Assert.assertNotNull(userSeller);
        Assert.assertEquals("taylor",userSeller.getName());
        Assert.assertEquals("Lokombe",userSeller.getSurname());
        Assert.assertEquals("214291324",userSeller.getStudentNumber());
        Assert.assertEquals("0780140396",userSeller.getTelNumber());
        Assert.assertEquals("Biology",userSeller.getBookTitle());
        Assert.assertEquals("Talk about human",userSeller.getBookDesc());
        Assert.assertEquals(200,200,userSeller.getPrice());
        Assert.assertEquals("28/12/1987",userSeller.getAdvertDate());
        Assert.assertEquals("04/01/1998",userSeller.getExpireDate());

        System.out.println(toString());
    }
}