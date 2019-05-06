package repository;

import Domain.SellerRating;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SellerRatingRepositoryImplTest
{
    private SellerRating sellerRating;
    private SellerRatingRepository repository;

   Set<String> values;


    @Before
    public void setUp() throws Exception
    {
        repository = SellerRatingRepositoryImpl.getRepository();
        //this.values = new SellerRatingFactory.getSellerRating("Taylor","Lokombe","*****","good","try");

    }




    @Test
    public void create()
    {

    }

    @Test
    public void update()
    {

    }

    @Test
    public void delete()
    {

    }

    @Test
    public void read()
    {
    }

    @Test
    public void getAll()
    {
    }
}
