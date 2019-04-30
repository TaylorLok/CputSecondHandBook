package repository;

import Domain.SellerRating;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellerRatingRepositoryImplTest
{
    SellerRating sell;


    @Before
    public void setUp() throws Exception
    {
        sell = new SellerRating.Builder()
                               .getSurName("Taylor")
                               .getUserName("Lokombe")
                               .getAdvertDate("30/04/2019")
                               .getRating("*****")
                               .getComment("very good")
                               .build();

    }

    @Test
    public void create()
    {
        System.out.println(sell.toString());
    }

    @Test
    public void update()
    {

    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
    }
}