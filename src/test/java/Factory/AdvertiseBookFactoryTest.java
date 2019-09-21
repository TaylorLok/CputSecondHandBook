package Factory;

import com.cput.ac.org.domain.AdvertiseBook;
import org.junit.Assert;
import org.junit.Test;

public class AdvertiseBookFactoryTest
{

    @Test
    public void getAdvert()
    {

        AdvertiseBook ads = new AdvertiseBook.Builder()

                .userName("Lokombe")
                .buyOrSell(false)
                .price(789.44)
                .title("game of thrones")
                .date("28/12/1998")
                .build();


        Assert.assertNotNull(ads);
        Assert.assertEquals("Lokombe", ads.getUserName());
        Assert.assertEquals("28/12/1998", ads.getDate());
        Assert.assertEquals("game of thrones", ads.getTitle());
        Assert.assertEquals(false, ads.isBuyOrSell());


    }
}