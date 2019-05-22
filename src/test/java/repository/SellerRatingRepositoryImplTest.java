package repository;

import com.cput.ac.org.Domain.SellerRating;
import com.cput.ac.org.Factory.SellerRatingFactory;
import com.cput.ac.org.repository.SellerRatingRepository;
import com.cput.ac.org.repository.SellerRatingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerRatingRepositoryImplTest
{
    private SellerRating sellerRating;
    private SellerRatingRepository repository;



    @Before
    public void setUp() throws Exception
    {
        repository = SellerRatingRepositoryImpl.getRepository();
        sellerRating = SellerRatingFactory.getSellerRating("anikwe","arinze","*****","15/05/2019",
                "very good lecture with motivation");

    }

    @Test
    public void create()
    {

     assertEquals(repository.create(sellerRating),repository.create(sellerRating));
    }

    @Test
    public void update()
    {
        assertEquals(repository.update(sellerRating),repository.update(sellerRating));
    }

    @Test
    public void delete()
    {
        repository.delete(sellerRating);
    }

    @Test
    public void read()
    {
        assertEquals(repository.read(sellerRating),repository.read(sellerRating));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}
