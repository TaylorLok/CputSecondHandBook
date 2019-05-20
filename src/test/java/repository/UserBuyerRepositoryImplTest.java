package repository;

import Domain.UserBuyer;
import Factory.UserBuyerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserBuyerRepositoryImplTest
{
    private UserBuyerRepository repository;
    private UserBuyer userBuyer;


    @Before
    public void setUp() throws Exception
    {
        repository = UserBuyerRepositoryImpl.getRepository();
        userBuyer = UserBuyerFactory.getBuyer("taylor","lokamba");
    }

    @Test
    public void create()
    {
        Assert.assertEquals(repository.create(userBuyer),repository.create(userBuyer));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.update(userBuyer),repository.update(userBuyer));
    }

    @Test
    public void delete()
    {
        repository.delete(userBuyer);
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.read(userBuyer),repository.read(userBuyer));
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(),repository.getAll());
    }
}