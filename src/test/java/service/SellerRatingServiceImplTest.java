package service;

import com.cput.ac.org.Domain.SellerRating;
import com.cput.ac.org.Factory.SellerRatingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cput.ac.org.repository.SellerRatingRepositoryImpl;

public class SellerRatingServiceImplTest {

    private SellerRatingRepositoryImpl repository;
    private SellerRating rating;

    @Before
    public void setUp() throws Exception
    {
        repository = SellerRatingRepositoryImpl.getRepository();
        rating = SellerRatingFactory.getSellerRating("Ayombo","Lokombe","*****","18/05/2019","cool");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(rating),repository.create(rating));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(rating),repository.update(rating));
    }

    @Test
    public void delete()
    {
        repository.delete(rating);
    }

    @Test
    public void read()
    {
        repository.read(rating);
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}