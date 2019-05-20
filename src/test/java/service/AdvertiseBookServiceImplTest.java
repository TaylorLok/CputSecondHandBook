package service;

import Domain.AdvertiseBook;
import Factory.AdvertiseBookFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.AdvertiseBookRepository;
import repository.AdvertiseBookRepositoryImpl;

import java.util.Set;

import static org.junit.Assert.*;

public class AdvertiseBookServiceImplTest
{

    private AdvertiseBookRepository repository;
    private AdvertiseBook advert;

    @Before
    public void setUp() throws Exception
    {
        repository = AdvertiseBookRepositoryImpl.getRepository();
        advert = AdvertiseBookFactory.getAdvert("Banele","Art of War",false,200,"17/12/1989");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(advert),repository.create(advert));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(advert),repository.update(advert));
    }

    @Test
    public void delete()
    {
        repository.delete(advert);
    }

    @Test
    public void read()
    {
        Assert.assertNotNull(advert);

        repository.read(advert);
    }

    @Test
    public void getAll()
    {
        Set<AdvertiseBook> advertiseBooks = this.repository.getAll();
        Assert.assertNotNull(advertiseBooks.size());
    }
}