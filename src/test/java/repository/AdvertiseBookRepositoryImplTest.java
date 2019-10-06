package repository;

import com.cput.ac.org.domain.AdvertiseBook;
import com.cput.ac.org.factory.AdvertiseBookFactory;
import com.cput.ac.org.repository.AdvertiseBookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class AdvertiseBookRepositoryImplTest
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
     // Assert.assertEquals("Banele",advert.getUserName());
     // Assert.assertEquals("Art of war ",advert.getTitle());
     // Assert.assertEquals("Buy",advert.isBuyOrSell());
     // Assert.assertEquals(200,advert.getPrice());
     // Assert.assertEquals("12/17/1222",advert.getDate());
        repository.read(advert);
    }

    @Test
    public void getAll()
    {
        Set<AdvertiseBook> advertiseBooks = this.repository.getAll();
        Assert.assertNotNull(advertiseBooks.size());
    }
}