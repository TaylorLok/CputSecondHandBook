package Factory;

import Domain.SellerRating;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
                                //.getComment("this was very good")
                               .build();

    }

    @Test
    public void getSellerRating()
    {
        System.out.println(sell.toString());
    }
}