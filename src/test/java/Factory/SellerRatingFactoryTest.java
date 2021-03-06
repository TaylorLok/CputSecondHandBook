package Factory;

import com.cput.ac.org.domain.SellerRating;
import org.junit.Before;
import org.junit.Test;

public class SellerRatingFactoryTest
{
    SellerRating sell;

    @Before
    public void setUp() throws Exception
    {
        sell = new SellerRating.Builder()
                               .getUserName("Taylor")
                                .getSurName("Lokombe")
                                .getAdvertDate("30/04/2019")
                                .getRating("*****")
                                .getComment("its very good")
                               .build();

    }

    @Test
    public void getSellerRating()
    {
        System.out.println(sell.toString());
    }
}